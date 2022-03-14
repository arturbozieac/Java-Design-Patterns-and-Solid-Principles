package solid.dependency_inversion_principle;


import java.io.IOException;

//Thrown by formatter
public class FormatException extends IOException {
	
	/**
	 * Exception UID
	 */
	private static final long serialVersionUID = 7362534637229442532L;

	public FormatException(Exception cause) {
		super(cause);
	}
}
