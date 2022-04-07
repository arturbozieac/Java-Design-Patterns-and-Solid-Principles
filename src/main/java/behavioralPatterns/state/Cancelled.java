package behavioralPatterns.state;

public class Cancelled implements OrderState{

	@Override
	public double handleCancellation() {
	   throw new IllegalStateException("A canceled order cannot be canceled again.");
	}


}
