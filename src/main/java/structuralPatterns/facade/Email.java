package structuralPatterns.facade;


public class Email {

	public static EmailBuilder getBuilder() {
		return new EmailBuilder();
	}
}
