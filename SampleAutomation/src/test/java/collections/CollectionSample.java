package collections;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionSample {
 public void collectionTrial()
 {
	 //a)Create new array list
 ArrayList<String> a1=new ArrayList<String>();
 a1.add("Violet");
 a1.add("Indigo");
 a1.add("Blue");
 a1.add("Red");
 a1.add("Green");
 System.out.println(a1);
    
      //b)Retrieve an element
 System.out.println("Element at position 2 is "+a1.get(1));
  
     //c)Iterate through elements in array list
 Iterator itr=a1.iterator();
 while(itr.hasNext()) {
		System.out.println(itr.next());
	}
 
     //d)Remove third element from array list
 a1.remove(2);
 System.out.println(a1);
 
     //e)Search an element in array list
 boolean b1=a1.contains("Green");
	if(b1)System.out.println("Element present in array list");
	else System.out.println("Element not present in array list");
 }
	public static void main(String[] args) {
		
    CollectionSample ct=new CollectionSample();
    ct.collectionTrial();
	}

}
