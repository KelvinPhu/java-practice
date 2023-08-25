package Java_OOP_practiceAbstract_quanLyHinhHoc;

public class circle extends shape {
	private double r;

	//constructor
	public circle(double r) {
		super();
		this.r = r;
	}

	//getter & setter
	public double getPoint() {
		return r;
	}

	public void setPoint(double point) {
		this.r = r;
	}

	@Override
	public double calculateArea() {
		return Math.PI*this.r*this.r;
	}
}
