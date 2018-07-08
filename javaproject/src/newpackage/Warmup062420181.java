package newpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Warmup062420181 {

	public static void main(String[] args) {
		// create an ArrayList
		// add 5 items
		// remove 2 items
		// iterate over all of them

		// List<Integer> items = new ArrayList<Integer>();
		Collection<Integer> items = new ArrayList<>();
		items.add(1);
		items.add(2);
		items.add(3);
		items.add(4);
		items.add(5);
//		items.remove(1);
//		items.remove(1);

		
		List<Integer> ls1 = Arrays.asList(66,44,32,33);
		
		
//		items.addAll(ls1);
//		System.out.println(items);
//		items.removeAll(ls1);
//		System.out.println(ls1);
		
		List<Integer> ls2 = Arrays.asList(1,33);
		items.retainAll(ls2);
		System.out.println(items);
		
		//items.remove(new Integer(1));

//		System.out.println(items);
//
//		for (int i = 0; i < items.size(); i++) {
//			System.out.println(items.size());

		
		
		
		
		}

	}


