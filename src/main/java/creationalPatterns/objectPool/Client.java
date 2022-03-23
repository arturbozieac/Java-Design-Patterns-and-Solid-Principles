package creationalPatterns.objectPool;

import javafx.geometry.Point2D;

@SuppressWarnings("restriction")
public class Client {

	public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<Bitmap>(() -> new Bitmap("Logo.jpg"), 5);
	
	public static void main(String[] args) {
    	Bitmap b1 = bitmapPool.get();
    	b1.setLocation(new Point2D(10, 10));
    	Bitmap b2 = bitmapPool.get();
    	b2.setLocation(new Point2D(10, -10));

       b1.draw();
       b2.draw();
       
       bitmapPool.release(b1);
       bitmapPool.release(b2);
    }
}
