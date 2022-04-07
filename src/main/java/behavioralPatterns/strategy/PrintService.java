package behavioralPatterns.strategy;


import java.util.LinkedList;

//Context 
public class PrintService {

	OrderPrinter printer;
	
    public PrintService(OrderPrinter printer) {
        this.printer = printer;
    }

    public void printOrders(LinkedList<Order> orders) {
    	printer.print(orders);
    }
}
