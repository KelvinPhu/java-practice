package Java_OOP_practiceComputerManager;

public class test {
	public static void main(String[] args) {
		Date date1 = new Date(12, 9, 1990);
		Date date2 = new Date(23, 06, 1980);
		Date date3 = new Date(14, 02, 1970);
		
		Country country1 = new Country("US", "USA");
		Country country2 = new Country("VN", "VietNam");
		Country country3 = new Country("JP", "Japan");
		
		ProduceCompany PC1 = new ProduceCompany("Acer", country1);
		ProduceCompany PC2 = new ProduceCompany("Asus", country2);
		ProduceCompany PC3 = new ProduceCompany("HP", country3);
		
		Computer computer1 = new Computer(PC1, date1, 1400, 12);
		Computer computer2 = new Computer(PC2, date2, 2300, 24);
		Computer computer3 = new Computer(PC3, date3, 4800, 48);
		
		System.out.println("Check price cheaper");
		System.out.println("computer 1 vs computer 2" +computer2.checkPriceCheaper(computer1));
		System.out.println("computer 2 vs computer 3" +computer2.checkPriceCheaper(computer3));
		
		System.out.println("Computer 1: " +computer1.printCountryProduceName());
		System.out.println("Computer 2: " +computer2.printCountryProduceName());
		System.out.println("Computer 3: " +computer3.printCountryProduceName());
	}
}
