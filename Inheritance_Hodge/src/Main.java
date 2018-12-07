
public class Main {

	public static void main(String[] args) {
		
		Insect insect = new Insect(5, 6);
		Spider spider = new Spider(15, true);
		Cricket cricket = new Cricket(2, 1.25);
		
		insect.crawl();
		insect.says();
		
		spider.crawl();
		spider.says();
		
		cricket.crawl();
		cricket.says();
		cricket.jump();
		
		if(spider instanceof Insect && spider instanceof Spider) {
		System.out.println(true + ": spider is a Spider and a Insect.");
			
		}

	}

}
