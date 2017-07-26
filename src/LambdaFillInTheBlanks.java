import java.util.stream.*;

public class LambdaFillInTheBlanks {

	public static void main(String[] args) {
		
		/*
		 * Easy
		 */
		
		      Stream.of(1, 2, 3, 5, 8).filter(i ->  (i < 3)).forEach(System.out::println);

	      Stream.of("cat", "dot", "fish", "rabbit").filter((p) -> { return  (p.length() == 4) ; } ).forEach(System.out::println);

		/*
		 * Hard
		 */
		
		long count = Stream.of("IBM", "Oracle", "Pivotal").filter(  ).count();
		//System.out.println(count);
		
		
	}

}
