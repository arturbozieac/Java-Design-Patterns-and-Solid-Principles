package creationalPatterns.factoryMethod;

import creationalPatterns.factoryMethod.message.Message;
import creationalPatterns.factoryMethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		
		return new TextMessage();
	}



}
