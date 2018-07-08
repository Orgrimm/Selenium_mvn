package newpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class BulkCollectionOperation {

	public static void main(String[] args) {
		
		Collection<String> ls = new ArrayList<>();
		ls.add("Hello");
		ls.add("Bye");
		
		
		ArrayList<String>ls1 = new ArrayList<>();
		ls.addAll(ls1);
		System.out.println(ls);
		
		ls.removeAll(ls1);
		System.out.println(ls1);
		
		
		ArrayList<String>ls2 = (ArrayList<String>) Arrays.asList("aaa", "Hello", "bbb");
		System.out.println(ls);
		ls.retainAll(ls2);
		System.out.println(ls);
		

	}

}
