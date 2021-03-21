import java.util.Comparator;

public class ComparatorName implements Comparator<Books> {

	@Override
	public int compare(Books book1, Books book2) {
		// TODO Auto-generated method stub
		if(book1.getTitulo().compareTo(book2.getTitulo()) > 0) {
			return 1;
		}
		return -1;
	}

}
