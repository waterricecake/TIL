package object;
class Book implements Cloneable{ //use implements for override clone
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	@Override
	public String toString() {
		return author+","+title;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub///call this method at garbage collections
		super.finalize();
	}
	
	
	
}
public class ToStringTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Book book = new Book("toji","park");
		
		System.out.println(book);
		
		String str = new String("toji");
		System.out.println(str.toString());
		
		Book book2 = (Book)book.clone();
		
		System.out.println(book2);
	}

}
