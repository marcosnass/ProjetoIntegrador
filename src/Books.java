
public class Books {
	private String title;
	private String isbn;
	private String author;
	private String edit;
	private String yearPub;
	
	
	public Books(String t, String i, String a, String e, String y) {
		setTitle(t);
		setIsbn(i);
		setAuthor(a);
		setEdit(e);
		setYearPub(y);
	}
	
	//methods special
	public void setTitle(String t) {
		this.title = t;
	}
	
	public String getTitlte() {
		return title;
	}
	
	public void setIsbn(String i) {
		this.isbn = i;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setAuthor(String a) {
		this.author = a;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setEdit(String e) {
		this.edit = e;
	}
	
	public String getEdit() {
		return edit;
	}
	
	public void setYearPub(String y) {
		this.yearPub = y;
	}
	
	public String getYearPub() {
		return yearPub;
	}
	
	//logical method
	public void displayBook() {
		System.out.print("Title: " + this.title + " - Author: " + this.author + "  - Publishing Company: " + this.yearPub);
	}

	public void includeBookFirst() {}
	public void includeBookLast() {}
	public void returnLenght() {}


}
