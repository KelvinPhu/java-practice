package Java_OOP_practiceAbstract_quanLyNhanVien;

public class test {
	public static void main(String[] args) {
		manager manager = new manager("John");
		engineer engineer = new engineer("Kelvin");
		salePerson salePerson = new salePerson("Tam");
		
		manager.calculateSalary();
		engineer.calculateSalary();
		salePerson.calculateSalary();
		
		System.out.println("manager salary: " +manager.getSalary());
		System.out.println("engineer salary: " +engineer.getSalary());
		System.out.println("salePerson salary: " +salePerson.getSalary());
	}
}
