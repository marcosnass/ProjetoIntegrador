import java.util.ArrayList;

public class ListBooks extends Books {
	private Books[] book;
	private int lenght;
	
	public ListBooks(int qt) {
		this.book = new Books[qt];
		this.lenght = 0;
	}
	
	public void addBook(Books b) throws Exception {
		if (this.lenght < this.book.length) {
			this.book[this.lenght] = b;
			this.lenght++;
		} else {
			throw new Exception("Vector it is full");
		}
		System.out.println("book registred whit success: " + b);
	}
	
}
