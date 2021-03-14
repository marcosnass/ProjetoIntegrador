
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		Books book1 = new Books();
		Books book2 = new Books();
		Books b = new Books();
		
		book1.setTitle("A Casa Blanca");
		book1.setAuthor("Pedro de Lara");
		book1.setEdit("Story in Comic");
		book1.setYearPub("2015");
		
		book2.setTitle("Harry Potter");
		book2.setAuthor("J.K Rowlling");
		book2.setEdit("XXXXXX");
		book2.setYearPub("1998");
		
		//add book in list
		//book1.addBook();
		//book2.addBook();
		
		//removed book from list
		//book2.removeBook();
		
		//add book in last position
		//System.out.println("Include book in last position");
		
		
		//show books in list
		//System.out.println("Show list of books:");
		//System.out.println(book1.toString());
		//System.out.println(book2.toString());
		
		
		String r = "";
		while (!r.equals("N")){
			ArrayList<Books> list = new ArrayList();
			System.out.print("Enter the title of book: ");
			String title = s.nextLine();
			b.setTitle(title);
			System.out.print("Now, enter the author of book: ");
			String author = s.nextLine();
			b.setAuthor(author);
			b.addBook(b);
			
			System.out.print("Want to continue? [S/N]");
			r = s.nextLine().toUpperCase();
			
		}
		b.returnList();
		b.removeBook(b);
		System.out.println("removing book...");
		b.returnList();
		System.out.println("---------------");
		System.out.println("End program...");
	}

}
