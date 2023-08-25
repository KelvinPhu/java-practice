package Java_OOP_practiceBookManager;

public class test {
	public static void main(String[] args) {
		Date date = new Date(29,4,1965);
		Date date1 = new Date(15,6,1970);
		Date date2 = new Date(14,3,1980);
		
		Author author = new Author("Jordan chee", date);
		Author author1 = new Author("kristy Amanda", date1);
		Author author2 = new Author("Eris kee", date2);
		
		Book book = new Book("Code Program", 19.5, 1990, author);
		Book book1 = new Book("Solving Problem", 39.9, 2000, author1);
		Book book2 = new Book("Code Solution", 29.2, 2010, author2);
		Book book3 = new Book("Code Practice", 12.9, 1990, author2);
		
		System.out.println("All the book detail and book name will be display here");
		book.printBookName();
		book1.printBookName();
		book2.printBookName();
		
		System.out.println("-----------------------");
		
		System.out.println("compare publishing year of book and book 3: " +book.checkSameYear(book3));
		System.out.println("compare publishing year of book 1 and book 2: " +book1.checkSameYear(book2));
		
		System.out.println("-----------------------");
		
		System.out.println("price after discount 15% for book 1 is " +book1.priceAfterDiscount(15));
		System.out.println("price after discount 10% for book is " +book.priceAfterDiscount(10));
		System.out.println("price after discount 13% for book 2 is " +book2.priceAfterDiscount(13));
		System.out.println("price after discount 16% for book 3 is " +book3.priceAfterDiscount(16));
	}
}
