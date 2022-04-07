package behavioralPatterns.templateMethod;

import java.io.File;
import java.io.FileNotFoundException;

public class Client {

	public static void main(String[] args) {
		Order order = new Order("2023");

		order.addItem("Soda", 2.50);
		order.addItem("Sandwitch", 11.95);
		order.addItem("Pizza", 15.95);

		OrderPrinter printer = new HtmlPrinter();
		File orderFile = new File("OrderReport.html");
		try {
			printer.printOrder(order, orderFile.getName());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
