
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		ListBooks l = new ListBooks(4);
		try {
			Books b1 = new Books();
			b1.setTitle("A cabana");
			b1.setAuthor("Pedro");
			l.addBook(b1);
			l.toString();
			Books b2 = new Books();
			b2.setTitle("A casa");
			b2.setAuthor("Zé");
			l.addBook(b2);
			l.toString();
			
		} catch (Exception e){
			e.printStackTrace();
		}
		
		
		
		
		
		
		System.out.println("---------------");
		System.out.println("End program...");
	}

}
