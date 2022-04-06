package behavioralPatterns.observer;

public class Client {

    public static void main(String[] args) {
    	Order order = new Order("100");
    	
    	PriceObserver priceObs = new PriceObserver();
    	
    	order.attach(priceObs);
    	order.addItem(50);
    	
    	System.out.println(order);
    	
    	order.addItem(150);
    	
    	System.out.println(order);
    }
}
