import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

class Student{
	int roll;
	String name;
}

public class ListDemo {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.roll = 1;
		s1.name = "Sneha";
		// list1 can only store String objects
		ArrayList<String> list1 = new ArrayList<String>(); //Type specific
		
		// list2 can store any type of data
		ArrayList list2 = new ArrayList(); // Any type of data
		
		//1. Add element to the list
		list1.add("Sneha");
		list1.add("Maheshwari");
		list2.add(10);
		list2.add("Maheshwari");
		list2.add(2.2);
		list2.add(s1);
		
		// print reference to the list -> shall print elements in the list the way we added in a sequence
		System.out.println("list 1 :" +list1);
		System.out.println("list 2 :" +list2);
		
		//2. Get element from the list
		System.out.println("List1 name: " + list1.get(1));
		System.out.println("list2 value: " + list2.get(3));
		
		//3. Update list
		list1.set(0, "sneha");
		System.out.println("List1 after updation: " +list1);
		
		//4. Delete list
		list2.remove(2);
		System.out.println("list2 after deletion: " +list2);
		
		// Remove all list items
		//list1.clear();
		//System.out.println("list1 after remove all: " +list1);
		
		//Searching
		if(list1.contains("Maheshwari")) {
			System.out.println("Maheshwari is present in list1");
		}
		else
			System.out.println("Maheshwari is not present in the list1");
		
		//Iterate in ArrayList
		System.out.println("Iterating with basic for loop");
		for(int i=0; i<list1.size(); i++){
			System.out.println(list1.get(i));
		}
		System.out.println("++++++++++++++++++");
		
		System.out.println("Iterating with inhanced for loop");
		for(String str : list1){
			System.out.println(str);
		}
		System.out.println("++++++++++++++++++");
		System.out.println("Iterating with iterator");	
		TreeSet ts = new TreeSet();
		// Populate ts
		for (Iterator it = ts.iterator(); it.hasNext(); ) {
		System.out.println("TreeSet element: " + it.next());
		}
	}

}
