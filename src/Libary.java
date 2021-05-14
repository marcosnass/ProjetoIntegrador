import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Libary
{
    ArrayList<Books> list = new ArrayList<Books>();
   
    public Libary()
    { }
   
    public ArrayList<Books> getBooks() {
    	return list;
    }
    
    public Books getBook(int pos) {
    	
    	return list.get(pos);
    }
    
    public int size() {
    	int siz;
    	siz = list.size();
    	return siz;
    }
    
    public void includeBook(Books book)
    {	
    	list.add(book);
    }
    
    public void includeBookFirst(Books book, int pos)
    {
    	list.add(pos, book);
    }
    
    public void includeBookLast(Books book, int pos)
    {
    	list.add(pos, book);
    }
    
    public void removeLast()
    {	
    	int siz;
    	siz = list.size();
        list.remove(siz-1);
    }
    
    public void removeInPos(int pos)
    {	
        list.remove(pos);
   
    }
    
    public void getBookTitle(String tit) throws ExcecaoDeLivroNaoEncontrado
    {	
    	String[] wB;
    	StringBuffer lista = new StringBuffer();
        
    	lista.append("Lista de livros encontrado com a palavra chave passada:\n");
    	
		for(Books book : list) { 
	    wB = book.getTitle().split(" ");
		for(String letter : wB) {
			if(tit.equals(letter)) {
				lista.append(
		        "\nTítulo: "+book.getTitle()+
		        "\nEditora: "+book.getEdit()+
		        "\nAutor: "+book.getAutor());
			}
		}
		}
		try {
		if( lista.length() == 56) {//o tamanho deve ser igaul a 56 devido ao primeiro append feito antes do for. Caso maior tem livro dentro da lista
			throw new ExcecaoDeLivroNaoEncontrado();
		}else {
		JOptionPane.showMessageDialog(null, lista.toString());
		}
		}catch(ExcecaoDeLivroNaoEncontrado e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}
    }
}










