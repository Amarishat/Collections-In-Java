package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Example1 {

	public static void main(String[] args) {
		
		LinkedList<String> a=new LinkedList<String>();
		a.add("Virat");
		a.add("Abd");
		Iterator<String>itr=a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
