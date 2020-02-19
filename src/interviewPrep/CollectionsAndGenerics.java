package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class CollectionsAndGenerics {

	public static void main(String[] args) {
		//collection();
		//list();
		set();
	}
	
	public static void collection(){
		/*Collection is a Interface in java
		 * List implemented this collection interface
		 * and ArrayList is implemented the List Properties
		 * So if you want to implement List or Collection interface we can use ArrayList class
		 * Collection is a alternative for array to store data where size is not known.and also
		 * we can not have a option to Add the value in the middle of data and also we cannot have a option to delete data in a row
		 * but this collection feature covers that backlogs
		 * it will allow you to add any type of data in your array or storing data values
		 * and also you can make your collection to make it store only one type of data like array by using generics
		 * Example shown below*/
		
		//collection using when trying to store anytype of data
		Collection obj=new ArrayList();
	    obj.add(2);
	    obj.add("satish");
	    obj.add('f');
	    obj.add(2.5);
        Iterator i= obj.iterator();
        while(i.hasNext()){
        	System.out.println(i.next());
        }
        
        Collection<Integer> obj1=new ArrayList<>();
        obj.add(1);
        obj.add(3);
        obj.add(4);
	}
	
	public static void list(){
		/*List is a interface implemented Collection 
		 * List have advanced feature then collection like remove or add the element at particular index
		 * it can be inherited to ArrayList class as ArrayList is implemented with List interface
		 * List holds the Duplicate Values
		 * it can also handle wit generics*/
		int[] arr={10,52,4,5,8,6,8};
		List data=Arrays.asList(arr); //converting or adding array data to List
		
		List obj=new ArrayList();
		obj.add(2);
		obj.add(5);
		obj.add(6);
		obj.add(7);
		obj.add(9);
		//now we can remove the 6 at 2nd index position and add 4 at that position
		
		obj.remove(2);
		obj.add(2,4);
		Iterator i=obj.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
	}
	
	public static void arrayList(){
		/*ArrayList is a class which is implemented with List Interface
		 * so this also have all the qualities of list
		 * */
		ArrayList list=new ArrayList<>();
		list.add(1);
		list.add(2);
	}
	
	public static void set(){
		/*Set is also an interface which implements to Collection interface
		 * Set interface is implemeted to HashSet and TreeSet like list implemented to ArrayList
		 * Set is same like list but it wont store the duplicate values
		 * when you use HashSet to read the set values it wont follow the sorted order to print the values as it store the
		 * values in sorted order
		 * Here hashing is when we enter the value to store it store the values in some space. and when u use the
		 * hashset to read the data it called the values which is nearer to fetch first
		 * for Sorting, you can use Treeset.*/
		
		Set data=new HashSet();
		data.add(1);
		data.add("satish");
		data.add('c');
		data.add(10);
		data.add("ssfatish");
		data.add('d');
		
	Iterator i=data.iterator();
	while(i.hasNext()){
		System.out.println(i.next());
	}
	System.out.println("TreeSet");
	Set data1=new TreeSet();
	data1.add(1);
	data1.add("satish");
	data1.add('c');
	data1.add(10);
	data1.add("ssfatish");
	data1.add('d');
	
	Iterator i1=data1.iterator();
	while(i1.hasNext()){
		System.out.println(i1.next());
	}
	}
}
