package structuralPatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

import structuralPatterns.flyweight.ErrorMessageFactory.ErrorType;

//Flyweight factory. Returns shared flyweight based on key
public class ErrorMessageFactory {
	
	//This serves as key for getting flyweight instance
	public enum ErrorType {GenericSystemError, PageNotFoundError, ServerError}
	
	private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

	public static ErrorMessageFactory getInstance() {
		return FACTORY;
	}
	
	private Map<ErrorType, SystemErrorMessage> errorMessages = new HashMap<>();
	 
	private ErrorMessageFactory() {
		errorMessages.put(ErrorType.GenericSystemError,
				new SystemErrorMessage("A generic error type $errorCode occured.",
						"http://myDomain.com/help?error"));
		errorMessages.put(ErrorType.PageNotFoundError,
				new SystemErrorMessage("Page not found $errorCode occured.",
						"http://myDomain.com/help?error"));
		errorMessages.put(ErrorType.ServerError,
				new SystemErrorMessage("A server error type $errorCode occured.",
						"http://myDomain.com/help?error"));
	}
	
	public SystemErrorMessage getError(ErrorType type) {
		return errorMessages.get(type);
	}
	
	public UserBannedErrorMessage getUserBannedMessage(String caseId) {
		return new UserBannedErrorMessage(caseId);
	}
}
