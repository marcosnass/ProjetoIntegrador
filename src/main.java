
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		

		Books book = new Books();		
		Books book1 = new Books();
		Books book2 = new Books();
		
		ArrayList<Books> list = new ArrayList();
		
		book.setTitle("A Cabana");
		book.setAuthor("Zé");
		book.setEdit("Figures");
		book.setYearPub("2010");
		
		book1.setTitle("A Casa Blanca");
		book1.setAuthor("Pedro de Lara");
		book1.setEdit("Story in Comic");
		book1.setYearPub("2015");
		
		book2.setTitle("Harry Potter");
		book2.setAuthor("J.K Rowlling");
		book2.setEdit("Disney");
		book2.setYearPub("1998");
		
		list.add(book);
		list.add(book1);
		list.add(book2);
		
		System.out.println("Show list of books:");
		for (Books i : list) {
			System.out.println(i);
		}
		
		System.out.println("Total of Books registred in the list: " + list.size());
	
	    
	}

}
