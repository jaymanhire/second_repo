package prod.consumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	int questionNo = 0;
	private BlockingQueue<Integer> questionQueue;

	public Producer(BlockingQueue<Integer> questionQueue) {
		this.questionQueue = questionQueue;
	}

	@Override
	public void run() {
		while (true) {
			// all of this needs to run(3 steps). NotThreadsafe if multiple producers
			try {
				synchronized (this) {
					int nextQuestion = questionNo++;
					System.out.println("Got new question: " + nextQuestion);
					questionQueue.put(nextQuestion); // we could increment inside of the .put constructor.
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
