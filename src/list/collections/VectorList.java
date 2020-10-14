package list.collections;

import java.util.ArrayList;
import java.util.Vector;

public class VectorList {
	
		public static void main(String args[])
		{
			
			ArrayList arr = new ArrayList(); 
	        arr.add(3); 
	        arr.add("Good Morning"); 
	        arr.add("Good Night"); 
	        arr.add(4); 
	        System.out.println(arr);
	        
	        Vector copyarr = new Vector();
	        copyarr.addAll(arr);
	        
	        System.out.println("Copy ArrayList To Vector"+copyarr);
	        
	        Vector clone = new Vector();
	        clone = (Vector)copyarr.clone();
	        
	        System.out.println("After CLone Method"+clone);
	        
			Vector v = new Vector();
			
			v.ensureCapacity(50);  
	        
	        System.out.println("Minimum capacity: " + v.capacity()); 
			v.add(2);
			v.add(4);
			v.add(7);
			v.add(0,3);
			v.add(1,5);
			v.add("xyz");
			System.out.println(v);
			v.set(0,"ABC");
			
			
			System.out.println(v);
			for(int i = 0;i<v.size();i++){
				System.out.println(v.get(i));
			}
			System.out.println(v.indexOf(3));
			v.clear();
			System.out.println(v.size());
		}
}
