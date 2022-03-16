package creationalPatterns.factoryMethod;

import creationalPatterns.factoryMethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {
	
	public Message getMessage() {
		Message message = createMessage();
		
		message.addDefaultHeaders();
		message.encrypt();
		
		return message;
	}
	
	// The factory method
	public abstract Message createMessage();
	
}
