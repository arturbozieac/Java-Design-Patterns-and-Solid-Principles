package creationalPatterns.factoryMethod.message;


public class TextMessage extends Message {
	
	@Override
	public String getContent() {
		return "Text";
	}
	
}
