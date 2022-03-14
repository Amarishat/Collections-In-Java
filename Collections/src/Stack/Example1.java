package Stack;

import java.util.Iterator;
import java.util.Stack;

public class Example1 {

	public static void main(String[] args) {
	  Stack<String>stack=new Stack<String>();
	  stack.push("Virat");
	  stack.push("Abd");
	  stack.push("Rcb");
	  stack.push("Rcbb");
	  stack.pop();
	  Iterator<String>itr=stack.iterator();
	  while(itr.hasNext())
	  {
		 System.out.println(itr.next());
		 
	  }
	  
	}

}
