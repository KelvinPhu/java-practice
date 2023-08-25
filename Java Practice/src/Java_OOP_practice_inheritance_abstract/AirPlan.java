package Java_OOP_practice_inheritance_abstract;

public class AirPlan extends Vehicle {
	private String fuelType;

	public AirPlan(String vehicleType, ProducedCompany producedCompany, String fuelType) {
		super(vehicleType, producedCompany);
		this.fuelType = fuelType;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	
	public void takeOff() {
		System.out.println("Take off");
	}
	
	public void landing() {
		System.out.println("landing");
	}

	@Override
	public double printSpeed() {
		return 500;
	}
	
	
	
}
