package Java_OOP_practiceAbstract_quanLyHinhHoc;

public class rectangle extends shape {

	private double width;
	private double height;
	
	
	//constructor
	public rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	
	//getter & setter
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}


	@Override
	public double calculateArea() {
		return this.width * this.height;
	}
	
}
