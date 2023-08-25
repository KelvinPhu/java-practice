package Java_OOP_practiceComputerManager;

public class Computer {
	private ProduceCompany produceCompany;
	private Date dateProduce;
	private double priceSale;
	private int warrantyMonth;
	
	//constructor
	public Computer(ProduceCompany produceCompany, Date dateProduce, double priceSale, int warrantyMonth) {
		this.produceCompany = produceCompany;
		this.dateProduce = dateProduce;
		this.priceSale = priceSale;
		this.warrantyMonth = warrantyMonth;
	}

	//getter & setter
	public ProduceCompany getProduceCompany() {
		return produceCompany;
	}

	public void setProduceCompany(ProduceCompany produceCompany) {
		this.produceCompany = produceCompany;
	}

	public Date getDateProduce() {
		return dateProduce;
	}

	public void setDateProduce(Date dateProduce) {
		this.dateProduce = dateProduce;
	}

	public double getPriceSale() {
		return priceSale;
	}

	public void setPriceSale(double priceSale) {
		this.priceSale = priceSale;
	}

	public int getWarrantyMonth() {
		return warrantyMonth;
	}

	public void setWarrantyMonth(int warrantyMonth) {
		this.warrantyMonth = warrantyMonth;
	}
	
	public boolean checkPriceCheaper(Computer anotherPrice) {
		return this.priceSale <= anotherPrice.priceSale;
	}
	
	public String printCountryProduceName() {
		return this.produceCompany.getCountry();
	}
}
