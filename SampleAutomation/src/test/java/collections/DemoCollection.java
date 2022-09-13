package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoCollection {
public void list()
{
	//Non-Generic
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add("Prabitha");
	a1.add(23.6777f);
	System.out.println(a1);
	a1.remove(1);
	System.out.println(a1);
	//Generic ArrayList
	ArrayList<String> a2=new ArrayList<String>();
	a2.add("Prabitha");
	a2.add("Rishab");
	a2.add("Prasanth");
	a2.add("Neenu");
	System.out.println(a2);
	System.out.println("Size of collection a1 is " +a1.size());
	System.out.println(a2.get(2));
	boolean b1=a2.contains("Rishab");
	System.out.println(b1);
	boolean b2=a2.contains("Riya");
	System.out.println(b2);
	ArrayList<String> a3=new ArrayList<String>();
	a3.addAll(a2);
	//a2.removeAll(a2);
	System.out.println(a2);
	System.out.println(a3);
	
	Iterator itr=a2.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	itr.remove();
	System.out.println(a2);
}
public static void main(String args[])
{
	DemoCollection dc=new DemoCollection();
	dc.list();
}
}
