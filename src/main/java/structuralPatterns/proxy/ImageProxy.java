package structuralPatterns.proxy;


import javafx.geometry.Point2D;
//Proxy class.
public class ImageProxy implements Image{
	
	private BitmapImage bitmapImage;
	private String imgName;
	private Point2D location;
	
	
	public ImageProxy(String name) {
		this.imgName = name;
	}

	@Override
	public void setLocation(Point2D point2d) {
		if(bitmapImage != null) {
			bitmapImage.setLocation(point2d);
		}else {
			this.location = point2d;
		}
	}

	@Override
	public Point2D getLocation() {
		if(bitmapImage != null) {
			return bitmapImage.getLocation();
		}else {
			return this.location;
		}
	}

	@Override
	public void render() {
		if(bitmapImage == null) {
			bitmapImage = new BitmapImage(imgName);
			if(location != null) {
				bitmapImage.setLocation(location);
			}
		}
		bitmapImage.render();
	}

	
	
}
