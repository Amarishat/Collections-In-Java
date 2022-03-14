package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Virat");
		list.add("Abd");
		list.add("KlRahul");
		list.add("Siraj");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
