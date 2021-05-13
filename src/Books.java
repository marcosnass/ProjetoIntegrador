import java.util.ArrayList;

public class Books extends Libary
{
	
    private String title;
    private String ISBN;
    private String edit;
    private String yearPub;
    private ArrayList<Author> author = new ArrayList<Author>();
    
    public Books(){}

    /*public Books(String ISBN, String title, ArrayList<Author> autor,  String edit, String year) 
    {
    	
        this.author = autor;
        setISBN(ISBN);
        setTitulo(title);
        setEdit(edit);
        setYearPub(year);
    }*/
    
    public String getTitle()
    { return title; }

    public ArrayList<Author> getAutor(){
    return author; }

    public String getISBN()
    { return ISBN; }

    public String getEdit()
    { return edit; }

    public String getYearPub()
    { return yearPub; }

    public void setTitulo(String title)
    { this.title = title; }

    
    /*public void setAutor(ArrayList<Author> autor)
    { 
    	this.author = autor; // UTILIZEI O CONSTRUOR DA CLASSE AUTOR AO INVÉS DOS MÉTODOS SET DA MESMA
    }*/
    
    public void setISBN(String ISBN)
    { this.ISBN = ISBN; }

    public void setEdit(String e)
    { this.edit = e; }

    public void setYearPub(String year)
    { this.yearPub = year; }

    public void addAuthor(Author a) {
    	author.add(a);
    }
    
	@Override
	public String toString() {
		return "Titulo = " + title + "\n"
				+ "ISBN = " + ISBN + "\n "
				+ "Editora = " + edit + "\n"
				+ "Ano de Pub/ = " + yearPub;
	}
}