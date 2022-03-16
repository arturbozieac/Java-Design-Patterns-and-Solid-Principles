package creationalPatterns.factoryMethod;

public class Client {

	public static void main(String[] args) {
		printMessage(new JSONMessageCreator());
	}
	
	public static void printMessage(MessageCreator creator) {
		System.out.println(creator.getMessage().getContent());
	}
}
