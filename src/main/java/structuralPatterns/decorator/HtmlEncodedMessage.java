package structuralPatterns.decorator;

import org.apache.commons.lang3.StringEscapeUtils;

//Decorator. Implements component interface
public class HtmlEncodedMessage implements Message {

	private Message message;
	
	public HtmlEncodedMessage(Message msg) {
		this.message = msg;
	}
	
	@Override
	public String getContent() {
		// Deprecated, used only for example.
		return StringEscapeUtils.escapeHtml4(message.getContent());
	}

}
