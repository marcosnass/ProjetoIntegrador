import java.util.ArrayList;

public class Libary
{
    private String nome;
    private String local;
    private int capacidade;
    private Books[] books;
    private int quantidade;
   
    public Libary()
    { }

    public Libary(String nome, String local, int capacidade)
    {
        setLocal(local);
        setNome(nome);
        books = new Books[capacidade];
        this.capacidade = capacidade;
        quantidade = 0;
    }

    public String getNome()
    { return nome; }

    public String getLocal()
    { return local; }

    public int getCapacidade()
    { return capacidade; }

    public int getQuantidade()
    { return quantidade; }

    public void setNome(String nome)
    { this.nome = nome; }

    public void setLocal(String local)
    { this.local = local; }

    public void createBooks(int capacidade)
    {
        this.capacidade = capacidade;
        books = new Books[capacidade];
    }
   
    public void incluirLivro(Books book)
    {
        if (quantidade < capacidade)
        {
            quantidade++;
            books[quantidade - 1] = book;
        }
    }
    
    public void includeBookFirst(Books book)
    {
        
        if (quantidade < capacidade)
        {
        	quantidade--;
        	books[0] = null;
        	if (books[0] == null) {
        		quantidade++;
        		books[0] = book;
        	}
        }
    }
    
    public void removeLast(Books book)
    {
        books[quantidade -1] = null;
        quantidade--;
    }
    
    public Books getBookTitle(String tit)
    {
        for(int i=0;i<quantidade;i++)
            if (books[i] != null)
                if (books[i].getTitulo().indexOf(tit) >= 0)
                    return books[i];
        return null;
    }
   
    public Books getBook(int posicao)
    {
        if (posicao < quantidade)
            return books[posicao];
        else
            return null;
    }
   
}