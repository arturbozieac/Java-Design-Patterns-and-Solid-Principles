package structuralPatterns.decorator;

public class Client {

	public static void main(String[] args) {
		Message m = new TextMessage("The <FORCE> is strong with this one!");
		System.out.println(m.getContent());
		
		m = new HtmlEncodedMessage(m);
		System.out.println(m.getContent());
		
		m = new Base64EncodedMessage(m);
		System.out.println(m.getContent());

	}
}
