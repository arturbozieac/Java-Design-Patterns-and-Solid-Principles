package behavioralPatterns.iterator;

public class Client {

	public static void main(String[] args) {
		Iterator<ThemeColor> it = ThemeColor.getIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
