package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_list  {
	public static <E> void main(String[]args) {
		// can contain duplicate value
		// maintain insertion order
		// it is not thread safe
		// allow random access to fetch element because it stores values the values on the basis of indexes
		ArrayList<Integer> ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar);
		System.out.println(ar.size());
		ar.add(40);
		ar.add(50);
		System.out.println(ar.size());
		System.out.println(ar.get(3));
		for(int i =0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		// generic vs non generic
		ArrayList<Integer>ar1 = new ArrayList<Integer>();
		ar1.add(10);
		//ar1.add("mohan");
		ArrayList<E>ar3 = new ArrayList<E>();
		ar.add(100);
		
		
		
		Employee e1 = new Employee("Prasad", 26, "Developer");
		Employee e2 = new Employee("Vikas",26,"Feature owener");
		Employee e3 = new Employee("MOhan",25,"Tester");
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
	  Iterator<Employee>it = ar4.iterator();
	  while(it.hasNext()) {
		 Employee emp = it.next();
		  System.out.println(emp.name);
		  System.out.println(emp.age);
		  System.out.println(emp.dept);
		  
	  }
	  // addall()
     
	  ArrayList<String>ar5 = new ArrayList<String>();
	  ar5.add("java");
	  ar5.add("c");
	  ar5.add("python");
	  ArrayList<String>ar6 = new ArrayList<String>();
	  ar6.add("c#");
	  ar6.add("ruby");
	  ar6.add("fortan");
	  ar5.addAll(ar6);
	  for(int i=0 ;i<ar5.size();i++) {
		  System.out.println(ar5.get(i));
	  }
	  ar5.removeAll(ar6);
	  for(int i=0 ;i<ar5.size();i++) {
		  System.out.println(ar5.get(i));
	  }
	  ArrayList<String>ar7 = new ArrayList<String>();
	  ar5.add("java");
	  ar5.add("c");
	  ar5.add("python");
	  ArrayList<String>ar8 = new ArrayList<String>();
	  ar6.add("java");
	  ar6.add("ruby");
	  ar6.add("fortan");
	  ar7.retainAll(ar8);
	  
	  for(int i=0 ;i<ar7.size();i++) {
		  System.out.println(ar7.get(i));
	  }
	  
	}

}
