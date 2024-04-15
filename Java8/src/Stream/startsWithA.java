package Stream;

import java.util.*;
import java.util.stream.Collectors;

// given list of names, return another list having names start with letter A
public class startsWithA {
     public static void main(String[] args) {
		
    	 List<String> input=List.of("Aman","Vaishali","Ankur","Vikrant","Ajay","Amit", "Ankit","Raju");
    	 System.out.println("Input List is :"+input);
    	List<String> answer= input.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
    	System.out.println("List of names start with A: "+ answer);
	}
}
