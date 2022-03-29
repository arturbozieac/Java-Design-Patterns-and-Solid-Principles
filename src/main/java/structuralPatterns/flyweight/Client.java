package structuralPatterns.flyweight;

import structuralPatterns.flyweight.ErrorMessageFactory.ErrorType;

public class Client {

	public static void main(String[] args) {
		SystemErrorMessage msg1 = ErrorMessageFactory.getInstance().getError(ErrorType.GenericSystemError);
		System.out.println(msg1.getText("4777"));
		
		UserBannedErrorMessage msg = ErrorMessageFactory.getInstance().getUserBannedMessage("1111");
		System.out.println(msg.getText(null));
	}

}
