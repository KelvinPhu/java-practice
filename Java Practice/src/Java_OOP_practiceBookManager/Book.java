package Java_OOP_practiceBookManager;

public class Book {
	private String bookName;
	private double bookPrice;
	private int publishingYear;
	private Author author;
	
	public Book(String bookName, double bookPrice, int publishingYear, Author author) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.publishingYear = publishingYear;
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	public void printBookName() {
		System.out.println(this.bookName);
	}
	
	public boolean checkSameYear(Book anotherBook) {
//		if (this.publishingYear == anotherBook.publishingYear){
//			return true;
//		}else {
//			return false;
//		}
		return this.publishingYear == anotherBook.publishingYear;
	}
	
	public double priceAfterDiscount(double x) {
		return this.bookPrice - (this.bookPrice * x/100);
//		return this.bookPrice * (1 * x / 100);
	}
	
}
