package solid.dependency_inversion_principle;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Message msg = new Message("This is a message again");
		MessagePrinter printer = new MessagePrinter();
		String fileName = "test_msg.json";
		
		try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))){
			printer.writeMessage(new JSONFormatter(), writer, msg);
		}
	}
}
