
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class main {
	
	public static void main(String[] args) {
		
		ArrayList<Books> list = new ArrayList();
		Scanner s = new Scanner(System.in);
		Books b = new Books();
	
		Books book1 = new Books();
		Books book2 = new Books();
		
		book1.setTitle("A Casa Blanca");
		book1.setAuthor("Pedro de Lara");
		book1.setEdit("Story in Comic");
		book1.setYearPub("2015");
		
		book2.setTitle("Harry Potter");
		book2.setAuthor("J.K Rowlling");
		book2.setEdit("XXXXXX");
		book2.setYearPub("1998");
		
		list.add(book1);
		list.add(book2);
		
		System.out.println("Include book in last position");
		
		System.out.println("Show list of books:");
		for (Books i : list) {
			System.out.println(i);
		}
		//String r = "";
		//while (!r.equals("N")){
			//ArrayList<Books> listAux = new ArrayList();
			//System.out.print("Enter the title of book: ");
			//String title = s.nextLine();
			//b.setTitle(title);
			//System.out.print("Now, enter the author of book: ");
			//String author = s.nextLine();
			//b.setAuthor(author);
			//listAux.add(b);
			//list = new ArrayList<Books>(listAux);
			//listAux.clear();
			
			//System.out.print("Want to continue? [S/N]");
			//r = s.nextLine().toUpperCase();
			
		//}
		System.out.println();
		System.out.println("---------------");
		System.out.println("End program...");
	}

}
