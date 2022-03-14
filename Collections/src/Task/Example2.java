package Task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Example2 {

	    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		
		int a=0;
		String b=null;
		ArrayList<String>List=new ArrayList<String>();
		
		do
		{
			
		
		System.out.println("1.Display Installed Application");
		System.out.println("2.Install An Application");
		System.out.println("3.UnInstall An Application");
		System.out.println("4.Update");
		System.out.println("5.Quit");
		a=s.nextInt();
		
	    
		 if(a==1)
		 {
			if(List.isEmpty())
			{
				
			
			System.out.println("No Application Installed");
			}
		
		
		else
		{
			Iterator itr=List.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
		  }
	    }
		
		 else if(a==2)
		{
			System.out.println("Enter Application Name To Update");
			       
			b=s.next();
			
		    List.add(b);
		    
			System.out.println("Application Successfully Installed");
			
			
		}
		 else if(a==3)
		{
			 Iterator itr=List.iterator();
			 
			 for(int i=0;itr.hasNext();i++)
			 {
				 System.out.println(i+" "+itr.next());
			 
			 
				 
			 }
			 
			System.out.println("Enter Index");
			int c=s.nextInt();
			List.remove(c);	
			System.out.println("Application Successfully UnInstalled");
			
		
	         }
		
		
		
		 else if(a==4)
		 {
			Iterator itr=List.iterator();
			
			
			for(int i=0;itr.hasNext();i++)
			{
				
				
				System.out.println(i+" "+itr.next());
				
			}
				System.out.println("Enter  Application To Update");
				String d=s.next();
				System.out.println("Enter Index To Update");
				int x=s.nextInt();
				List.set(x, d);
				
				System.out.println("Updated");
				
				while(itr.hasNext())
				{
					
					
					System.out.println(itr.next());
					
				}
				
			}
		 
		else
			return;
	    }
	    
		  while(a!=0);
		  {  
			
		  }
	}
}

	


