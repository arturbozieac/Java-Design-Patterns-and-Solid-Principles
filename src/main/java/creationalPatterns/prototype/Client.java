package creationalPatterns.prototype;

import javafx.geometry.Point3D;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman swrd1 = new Swordsman();
        swrd1.move(new Point3D(-10, 0, 0), 20);
        swrd1.attack();
        System.out.println(swrd1);
        
        Swordsman swrd2 = (Swordsman) swrd1.clone();
        System.out.println("The new identical warrior on the field have been spawned : " + swrd2);
	}

}
