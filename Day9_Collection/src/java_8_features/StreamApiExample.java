package java_8_features;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApiExample {
	public static void main(String[] args) { 
		List<String> names =
			List.of("Alex","Harry","James","Thomas","Leon");
		Stream<String> namesStream = names.stream();
		//Consumer = Functional interface
		Consumer<String> myConsumer = (myName) -> System.out.println(myName.toUpperCase());
		namesStream.forEach(myConsumer );
		
		System.out.println("========================================");
		
		List<Integer> numbers = List.of(45,63,81,9,18,36);
		Stream<Integer> numberStream = numbers.stream();
		Predicate<Integer> pr = num -> num % 2 == 0;
		Stream<Integer> evenNumStream = numberStream.filter(pr);
		Consumer<Integer> cons = num -> System.out.println(num);
		evenNumStream.forEach(cons);
		
		//Simple one line method
		
		numbers.stream().filter(num -> num % 2 == 0).forEach( num -> System.out.println(num));
	}
}
