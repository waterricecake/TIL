package Practice;

public class Mydate {
	int day;
	int month;
	int year;
	
	public Mydate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Mydate) {
			Mydate date = (Mydate)obj;
			return this.day == date.day & this.month == date.month & this.year == date.year;
		}
		return false;
	}
	
}