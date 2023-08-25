package Java_OOP_practice_inheritance_abstract;

public class Car extends Vehicle {
	private String fuelType;

	public Car(String vehicleType, ProducedCompany producedCompany, String fuelType) {
		super(vehicleType, producedCompany);
		this.fuelType = fuelType;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public double printSpeed() {
		return 70;
	}

	
	
}
