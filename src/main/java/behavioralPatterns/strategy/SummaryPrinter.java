package behavioralPatterns.strategy;

import java.util.Collection;
import java.util.Iterator;

//Concrete strategy
public class SummaryPrinter implements OrderPrinter{

	@Override
	public void print(Collection<Order> orders) {
		System.out.println("************* Sumarry Report ***********");
        Iterator<Order> iter = orders.iterator();
        double total = 0;
        for(int i=1;iter.hasNext();i++) {
            Order order = iter.next();
            System.out.println(i+". "+order.getId()+" \t"+order.getDate());
        }
        System.out.println("----------------------------------------");
        System.out.println("\tGrand Total "+total);
	}

	
}
