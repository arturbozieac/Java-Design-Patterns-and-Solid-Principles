package solid.liskov_substitution_principle;

public class Square implements Shape {
	
	private int side;
	
	public Square(int side) {
		this.setSide(side);
	}

	/**
	 * @return the side
	 */
	public int getSide() {
		return side;
	}

	/**
	 * @param side the side to set
	 */
	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public int computeArea() {
		return side * side;
	}
	

}
