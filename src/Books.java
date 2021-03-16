public class Books
{
    private String titulo;
    private String autor;
    private String ISBN;
    private String edit;
    private String yearPub;
    public Books()
    { }

    public Books(String ISBN, String titulo, String autor, String edit, String year)
    {
        setAutor(autor);
        setISBN(ISBN);
        setTitulo(titulo);
        setEdit(edit);
        setYearPub(year);
    }

    public String getTitulo()
    { return titulo; }

    public String getAutor()
    { return autor; }

    public String getISBN()
    { return ISBN; }

    public String getEdit()
    { return edit; }

    public String getYearPub()
    { return yearPub; }

    public void setTitulo(String titulo)
    { this.titulo = titulo; }

    public void setAutor(String autor)
    { this.autor = autor; }

    public void setISBN(String ISBN)
    { this.ISBN = ISBN; }

    public void setEdit(String e)
    { this.edit = e; }

    public void setYearPub(String year)
    { this.yearPub = year; }
   
}