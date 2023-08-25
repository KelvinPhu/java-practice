package Java_OOP_practiceFilmManager;

public class Movie {
	private String movieName;
	private int yearProduce;
	private ProduceCompany produceCompany;
	private double ticketPrice;
	private MovieDate movieDate;
	
	//Constructor
	public Movie(String movieName, int yearProduce, ProduceCompany produceCompany, double ticketPrice, MovieDate moviewDate) {
		this.movieName = movieName;
		this.yearProduce = yearProduce;
		this.produceCompany = produceCompany;
		this.ticketPrice = ticketPrice;
		this.movieDate = moviewDate;
	}

	
	//Getter & Setter
	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public int getYearProduce() {
		return yearProduce;
	}


	public void setYearProduce(int yearProduce) {
		this.yearProduce = yearProduce;
	}


	public ProduceCompany getProduceCompany() {
		return produceCompany;
	}


	public void setProduceCompany(ProduceCompany produceCompany) {
		this.produceCompany = produceCompany;
	}


	public double getTicketPrice() {
		return ticketPrice;
	}


	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}


	public MovieDate getMoviewDate() {
		return movieDate;
	}


	public void setMoviewDate(MovieDate moviewDate) {
		this.movieDate = moviewDate;
	}
	
	
	// check ticket price cheaper
	public boolean checkTicketPriceCheaper(Movie anotherMovie) {
		return this.ticketPrice < anotherMovie.ticketPrice;
	}
	
	// ticket price after discount
	public double ticketPriceAfterDiscount(double x) {
		return this.ticketPrice - (this.ticketPrice * x/100);
	}
}
