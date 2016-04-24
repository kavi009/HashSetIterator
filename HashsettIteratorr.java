package session8;

import java.util.HashSet;
import java.util.*;

public class HashsettIteratorr {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // create hash set
		   HashSet <String> newset = new HashSet <String>();
		                  
		   // populate hash set
		   newset.add("Learn"); 
		   newset.add("Easily");
		   newset.add("Java"); 
		   newset.add("course");
		      
		   // create an iterator
		   Iterator iterator = newset.iterator(); 
		      
		   // check values
		   while (iterator.hasNext()){
		   System.out.println("Value: "+iterator.next() + " ");  
		   }
	}

}
