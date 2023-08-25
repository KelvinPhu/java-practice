package Java_OOP_practiceAbstract_quanLyHinhHoc;

public class test {
	public static void main(String[] args) {
		rectangle rec = new rectangle(9, 12);
		circle cir = new circle(12);
		
		System.out.println("The area of rectangle is: "+rec.calculateArea());
		System.out.println("The area of circle is: " +cir.calculateArea());
	}
}
