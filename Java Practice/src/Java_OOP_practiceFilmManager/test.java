package Java_OOP_practiceFilmManager;

public class test {
	public static void main(String[] args) {
		MovieDate md1 = new MovieDate(12, 9, 2012);
		MovieDate md2 = new MovieDate(23, 11, 2018);
		MovieDate md3 = new MovieDate(03, 06, 2014);
		MovieDate md4= new MovieDate(07, 12, 2016);
		
		ProduceCompany pc1 = new ProduceCompany("US Firm", "USA");
		ProduceCompany pc2 = new ProduceCompany("Galaxy", "USA");
		ProduceCompany pc3 = new ProduceCompany("Holiwood", "USA");
		ProduceCompany pc4 = new ProduceCompany("US Movie", "USA");
		
		Movie m1 = new Movie("2008 Crisis", 2012, pc1, 12.9, md1);
		Movie m2 = new Movie("dirty money", 2016, pc3, 22, md4);
		Movie m3 = new Movie("2008 Crisis", 2018, pc4, 13.4, md2);
		Movie m4 = new Movie("2008 Crisis", 2014, pc2, 17.2, md2);
		
		System.out.println("Check ticket price of m1 and m2: "+ m1.checkTicketPriceCheaper(m2));   
		System.out.println("Check ticket price of m2 and m3: "+ m2.checkTicketPriceCheaper(m3));
		System.out.println("Check ticket price of m3 and m4: "+ m3.checkTicketPriceCheaper(m4));
		System.out.println("Check ticket price of m2 and m4: "+ m2.checkTicketPriceCheaper(m4));
		
		System.out.println("---------------------");
		
		System.out.println("produce company name of Movie 1: " + pc1.getCompanyName());
		System.out.println("produce company name of Movie 2: " + pc2.getCompanyName());
		System.out.println("produce company name of MOvie 3: " + pc3.getCompanyName());
		System.out.println("produce company name of Movie 4: " + pc4.getCompanyName());
		
		System.out.println("---------------------");
		
		System.out.println("Ticket price of movie 1 after discount 10%: " + m1.ticketPriceAfterDiscount(10));   
		System.out.println("Ticket price of movie 2 after discount 20%: " + m2.ticketPriceAfterDiscount(20));
		System.out.println("Ticket price of movie 3 after discount 16%: " + m3.ticketPriceAfterDiscount(16));
		System.out.println("Ticket price of movie 4 after discount 13%: " + m4.ticketPriceAfterDiscount(13));
	}
}
