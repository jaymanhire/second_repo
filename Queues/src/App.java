import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {

		// (head)<- oooooooooooooooooooooooooooooo <-(tail) FIFO

		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

		// System.out.println("Head of queue is: " + q1.element());

		q1.add(10);
		q1.add(20);
		q1.add(30);
		System.out.println("Head of queue is: " + q1.element());
		try {
			q1.add(40);
		} catch (IllegalStateException e) {
			System.out.println("Tried to add too many itmes to queue.");
		}
		for (Integer value : q1) {
			System.out.println("Queue value: " + value);
		}

		/*
		 * Integer value; value = q1.remove(); System.out.println("Removed from queue: "
		 * + value);
		 */
		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());

		try {
			System.out.println("Removed from queue: " + q1.remove());
		} catch (NoSuchElementException e) {
			System.out.println("Tried to remove too many itmes to queue.");
		}
		System.out.println("------------------------------------------------------");

		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		
		System.out.println("Queue 2 peek: " + q2.peek());

		// System.out.println("Head of queue is: " + q1.element());

		q2.offer(10);
		q2.offer(20);
		System.out.println("Queue 2 peek: " + q2.peek());
		
		if (q2.offer(30) == false) {
			System.out.println("Offer failed to add additional item to queue.");
		}
		for (Integer value : q2) {
			System.out.println("Queue value: " + value);
		}
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll());
	}

}
