package Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Creation {
	public static void main(String[] args) {
		
		//-->  1: Creating Stream using collection object
		 List<Integer> list=	 List.of(2,3,5,6,8,11,12);
		 Stream<Integer> stream1=list.stream(); 
		 List<Integer> ans=stream1.filter(i->i%2==0).collect(Collectors.toList()); // using filter method to filter out even numbers, then using collect method to return ans in list
		 
		 
		 // printing using forEach()
		 ans.forEach(e->{
			 System.out.println(e);
		 });

       // 2--> using empty() method of Stream interface
		 
              Stream<Object> emptystream=Stream.empty();
       // 3: ---> using of() method f stream
              String[] array= {"Ankit", "Nidhi", "khushi", "Vikrant", "Vishal"};
             Stream<String> stream2= Stream.of(array);
              
             stream2.forEach(e->{
            	 System.out.print(e+" , ");
             });
		

	 
	 }
	
 
}
