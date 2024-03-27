package checkedException;
/*
  consider the following Java program that opens the file and prints the first three lines of it. 
 * The program doesn’t compile, because the function main() uses FileReader(), 
 * and FileReader() throws a checked exception FileNotFoundException. 
 * It also uses readLine() and close() methods, and these methods also throw checked exception IOException
 */

/*
 To fix the above program, we either need to specify a list of exceptions using throws, 
 or we need to use a try-catch block. We have used throws in the below program. 
 Since FileNotFoundException is a subclass of IOException, 
 we can just specify IOException in the throws list and make the above program compiler-error-free.
*/

import java.util.*;
import java.io.*;
public class checkDemo {

	
	
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub

		FileReader file=new FileReader("E:\\Test.txt");
		
		BufferedReader fileInput=new BufferedReader(file);
		
		for(int counter = 0; counter < 3; counter++)
        System.out.println(fileInput.readLine());

    // Closing all file connections
    // using close() method
    // Good practice to avoid any memory leakage
    fileInput.close();
	}

}
