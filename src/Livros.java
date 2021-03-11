
public class Livros {
	private String title;
	private String isbn;
	private String author;
	private String edit;
	private String yearPub;
	
	//comment
	//other comment
	//something
	
	public Livros(String t, String i, String a, String e, String y) {
		setTitle(t);
		setIsbn(i);
		setAuthor(a);
		setEdit(e);
		setYearPub(y);
	}
	
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
	
	
	public void displayBook() {
		System.out.print("Title: " + this.title + " - Author: " + this.author + "  - Publishing Company: " + this.yearPub);
	}
	

}