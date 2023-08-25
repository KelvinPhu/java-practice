package Java_OOP_practiceAbstract_quanLyNhanVien;

public class engineer extends employee {

	public engineer(String name) {
		super(name);
	}

	@Override
	public double calculateSalary() {
		 double baseSalary = 4000;
	     double overtimePay = 1000;
	     double totalSalary = baseSalary + overtimePay;
	     return salary = totalSalary;
	}

}
