package Java_OOP_practice_inheritance_abstract;

public class test {
	public static void main(String[] args) {
		ProducedCompany pc = new ProducedCompany("hãng 1", "Viet Nam");
		ProducedCompany pc1 = new ProducedCompany("hãng 2", "Viet Nam");
		ProducedCompany pc2 = new ProducedCompany("hãng 3", "Austrailia");
		ProducedCompany pc3 = new ProducedCompany("hãng 4", "Singapore");
		
		Vehicle vh = new AirPlan("airBus330", pc, "AvGas");
		Vehicle vh1 = new Car("Honda", pc1, "Mogas ");
		Vehicle vh2 = new Bicycle(null, pc2);
		
		System.out.println("print produce company: ");
		System.out.println(vh.printProduceCompanyName());
		
		vh1.startRun();
		
		System.out.println("vh speed: " +vh.printSpeed());
		System.out.println("vh1 speed: " +vh1.printSpeed());
		System.out.println("vh2 speed: " +vh2.printSpeed());
		
		vh.stop();
		
	}
}
