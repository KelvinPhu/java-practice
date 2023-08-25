package Java_OOP_practice_inheritance_abstract;

public abstract class Vehicle {
	protected String vehicleType;
	protected ProducedCompany producedCompany;
	
	public Vehicle(String vehicleType, ProducedCompany producedCompany) {
		super();
		this.vehicleType = vehicleType;
		this.producedCompany = producedCompany;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public ProducedCompany getProducedCompany() {
		return producedCompany;
	}

	public void setProducedCompany(ProducedCompany producedCompany) {
		this.producedCompany = producedCompany;
	}


	public String printProduceCompanyName() {
		return this.producedCompany.getComapnyName();
	}
	
	public void startRun() {
		System.out.println("Start going");
	}
	
	public void speedUp() {
		System.out.println("speed Up");
	}
	
	public void stop() {
		System.out.println("stop");
	}
	
	public abstract double printSpeed();

}
