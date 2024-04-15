package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// concat() method of stream interface
		List<Integer> arr= List.of(1,4,5,9,11,80,53,24,11,6,31);
		Stream<Integer> stream=arr.stream().sorted();
		
		List<String> list=List.of("A","B","C","j","a","O");
		Stream<String> stream2=list.stream().sorted();
		
		Stream<Object> newStream=Stream.concat(stream, stream2);
		
		newStream.forEach(System.out::println);
		
		
	}

}
