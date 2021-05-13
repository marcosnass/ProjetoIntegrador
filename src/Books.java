public class Books extends Libary
{
    private String title;
    private String autor;
    private String ISBN;
    private String edit;
    private String yearPub;
    
    public Books(){}

    public Books(String ISBN, String title, String autor, String edit, String year)
    {
        setAutor(autor);
        setISBN(ISBN);
        setTitulo(title);
        setEdit(edit);
        setYearPub(year);
    }

    public String getTitle()
    { return title; }

    public String getAutor()
    { return autor; }

    public String getISBN()
    { return ISBN; }

    public String getEdit()
    { return edit; }

    public String getYearPub()
    { return yearPub; }

    public void setTitulo(String title)
    { this.title = title; }

    public void setAutor(String autor)
    { this.autor = autor; }

    public void setISBN(String ISBN)
    { this.ISBN = ISBN; }

    public void setEdit(String e)
    { this.edit = e; }

    public void setYearPub(String year)
    { this.yearPub = year; }

	@Override
	public String toString() {
		return "Titulo = " + title + ", Autor = " + autor + ", ISBN = " + ISBN + ", Editora = " + edit + ", Ano de P/ = "
				+ yearPub;
	}
   
    
    
}