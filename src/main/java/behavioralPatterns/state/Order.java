package behavioralPatterns.state;

//Context class
public class Order {

	private OrderState currentState;
	
	public Order() {
		this.currentState = new New();
	}
	
	public double cancel() {
		double charges = currentState.handleCancellation();
		return charges;
	}
   
	public void paymentSuccessful() {
		currentState = new Paid();
	}
	
	public void dispatched() {
		currentState = new Cancelled();
	}
	
	public void delivered() {
		currentState = new Delivered();
	}
}
