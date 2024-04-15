package Stream;

import java.util.*;
import java.util.stream.Collectors;

//WAP to return sqaure of each num
public class SquareOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=List.of(2,3,4,5,6,8,9,7,15,16,13,14,19);
		System.out.println(list);
		
		System.out.println(list.stream()
				                .map(i->i*i)
				                .collect(Collectors.toList())
				                
				           );
		
		//  Sorting using stream sorted() 
	    List<Integer> sortedlist=	list.stream().sorted().collect(Collectors.toList());
	    sortedlist.forEach(System.out::println);
	    
	    //finding min and max using stream
	    
	   int minVal= list.stream().min((x,y)->x.compareTo(y)).get();
	   int maxVal=list.stream().max((x,y)->x.compareTo(y)).get();
	   
	   System.out.println("min is :" + minVal+"\nmax val is :"+maxVal);
	    
	}

}
