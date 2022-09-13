package collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {

	public void list()
	{
	List<Integer>a1=new ArrayList<Integer>();	
	a1.add(23);
	a1.add(90);
	a1.add(57);
	a1.add(78);
	a1.add(32);
	System.out.println(a1);
	System.out.println("Element at 3rd position "+a1.get(2));
	System.out.println("Size of the collection is "+a1.size());
	
	}
	public static void main(String[] args) {
	
    CollectionList cl=new CollectionList();
    cl.list();
	}

}
