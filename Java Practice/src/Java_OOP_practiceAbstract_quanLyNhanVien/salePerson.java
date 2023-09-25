package Java_OOP_practiceAbstract_quanLyNhanVien;

public class salePerson extends employee {
	public salePerson(String name) {
		super(name);
	}
	

	@Override
	public double calculateSalary() {
		double baseSalary = 4000;
		double bonus = 1200;
		double totalSalary = baseSalary + bonus;
		return salary = totalSalary;
	}
	
	
}
