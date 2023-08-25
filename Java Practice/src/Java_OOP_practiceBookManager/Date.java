package Java_OOP_practiceBookManager;

public class Date {
	private int date, month, year;

	public Date(int date, int month, int year) {
		this.date = date;
		this.month = month;
		this.year = year;
	}

	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
