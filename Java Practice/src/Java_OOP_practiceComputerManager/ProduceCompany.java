package Java_OOP_practiceComputerManager;

public class ProduceCompany {
	private String produceCompanyName;
	private Country country;
	
	//constructor
	public ProduceCompany(String produceCompanyName, Country country) {
		this.produceCompanyName = produceCompanyName;
		this.country = country;
	}

	//getter & setter
	public String getProduceCompanyName() {
		return produceCompanyName;
	}

	public void setProduceCompanyName(String produceCompanyName) {
		this.produceCompanyName = produceCompanyName;
	}

	public String getCountry() {
		return this.country.getCountryName();
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
}
