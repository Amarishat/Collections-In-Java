package Vector;

import java.util.Iterator;
import java.util.Vector;

public class Example1 {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("Virat");
		v.add("Abd");
		v.add("chahal");
		v.add("Max");
		v.add("Siraj");
	    Iterator<String>itr=v.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	}

}
