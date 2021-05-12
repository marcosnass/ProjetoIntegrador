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
    
    public Books getBookTitle(String tit)
    {
    
    	for(Books book : list) {
    		if(tit.equals(book.getTitulo()))
    			return book;
    	} 
    	return null;
    	
    }
   
  
}