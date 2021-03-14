
public class Books {
	private String title;
	private String isbn;
	private String author;
	private String edit;
	private String yearPub;
	
	
	public Books() {}
	
	//special methods 
	public void setTitle(String t) {
		this.title = t;
	}
	
	public String getTitle() {
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

	
	public String toString() {
		return "Title: " + this.getTitle() + " - Author: " + this.getAuthor() + "  - Publishing Company: " 
	+ this.getEdit() + " - Year Publishing: " + this.getYearPub();
	}

	public void includeBookLast() {}
	public void returnLenght() {}


}
