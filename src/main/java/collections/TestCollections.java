package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
	public static void main(String[] args) {
		// Create a list of three strings
		List<String> list = Collections.nCopies(3, "red");

		// Create an array list
		ArrayList<String> arrayList = new ArrayList<String>(list);

		System.out.println("The initial list is " + arrayList);

		list = null; // Release list

		Collections.fill(arrayList, "yellow");
		System.out.println("After filling yellow, the list is " + arrayList);

		arrayList.add("white");
		arrayList.add("black");
		arrayList.add("orange");

		System.out.println("After adding new elements, the list is\n" + arrayList);

		Collections.shuffle(arrayList);

		System.out.println("After shuffling, the list is\n" + arrayList);

		System.out.println("The minimum element in the list is " + Collections.min(arrayList));
		System.out.println("The maximum element in the list is " + Collections.max(arrayList));

		Collections.sort(arrayList);
		System.out.println("The sorted list is\n" + arrayList);
		
		System.out.println("The search result for gray is " + Collections.binarySearch(arrayList, "gray"));


		List<String> syncList = Collections.synchronizedList(arrayList);

		List<String> unmodifiableList = Collections.unmodifiableList(syncList);

		arrayList = null; // Release arrayList
		syncList = null; // Release syncList

		try {
			unmodifiableList.add("black");
		} catch (Exception ex) {
			System.out.println(ex);
			ex.printStackTrace();
		}
	}
}
