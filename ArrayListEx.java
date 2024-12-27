package day21;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class ArrayListEx{
public static void main(String[] args) {
	
	ArrayList list = new ArrayList();
	
	list.add(10);
	list.add(50);
	list.add(30);
	list.add(20);
	list.add(40);
	list.add("abi");
	list.addFirst(100);
	
	System.out.println("Original list: "+list);
	System.out.println("removed data: "+list.remove("abi"));
	System.out.println(list);
	System.out.println("contains: " +list.contains("abi"));
	list.remove(Integer.valueOf(10));
	System.out.println("remove data without index number: "+list);
	System.out.println("remove data using index number: "+list.remove(2));
	System.out.println("final list: "+list);
	
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	list2.add(90);
	list2.add(70);
	list2.add(80);
	list2.add(60);
	
	System.out.println("original list2: "+list2);
	list.addAll(0, list2);
	list.addAll(list2);
	System.out.println("add 2 array list: "+list);
	Collections.sort(list);
	System.out.println("sorted list: "+list);
	Collections.sort(list, Comparator.reverseOrder());
	System.out.println("sorted list in reverse order: "+list);
	
	Integer[] arr1 =  new Integer[list2.size()];
	list2.toArray(arr1);
	System.out.println(arr1[0]);
//	System.out.println(arr1);
	for (Object a: arr1) {
		System.out.println(a);
	}
}}


