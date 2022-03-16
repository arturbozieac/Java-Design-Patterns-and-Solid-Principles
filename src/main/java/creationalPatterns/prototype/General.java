package creationalPatterns.prototype;


//Doesn't support cloning
public class General extends GameUnit{

	private String state = "idle";
	
	public void boostMorale() {
		this.state = "MoralBoost";
	}
	
	@Override
	public String toString() {
		return "General "+state+" @ "+getPosition();
	}
	
	@Override
	protected GameUnit clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Generals are unique");
	}

	@Override
	public void resetUnit() {
		// Interface segregation principle under attack, STAY STRONG FOLKS!
		throw new UnsupportedOperationException("Reset not supported");
	}
	
}
