import java.util.stream.*;

public class MethodReferencesFillInTheBlanks {

	public static void main(String[] args) {
		
		Stream.of("", "b", "bc").forEach(System.out::println );
		
		Stream.of("", "b", "bc").filter(String::isEmpty).forEach(System.out::println);
	
	}

}
