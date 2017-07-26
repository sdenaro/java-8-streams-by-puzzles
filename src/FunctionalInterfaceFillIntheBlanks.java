import java.util.*;
import java.util.function.*;

public class FunctionalInterfaceFillIntheBlanks {

	public static void main(String[] args) {
		
		   
      Predicate<String> p = s -> s.isEmpty();
		
      Function<String, Integer> f =  (s -> s.length() ) ;  
		
		Consumer<Double> c = (d -> System.out.println(d) );
		
		//Supplier<Integer> s = _______________________;
		
		//___________ ex = x -> "".equals(x.get(0));
 	
	}
}
