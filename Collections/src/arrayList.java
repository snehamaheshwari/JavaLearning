import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
        
		// Q #10) Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.	
		ArrayList list = new ArrayList();
        list.add("20");
        list.add("30");
        list.add("40");
        System.out.println(list.size());
        System.out.println("While Loop:");
        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("Advanced For Loop:");
        for(Object obj : list) {
            System.out.println(obj);
    }
        System.out.println("For Loop:");
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
}
}
