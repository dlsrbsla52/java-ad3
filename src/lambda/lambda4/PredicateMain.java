package lambda.lambda4;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateMain {
    
    static void main() {
        Predicate<Integer> predicate1 = new Predicate<>() {
            @Override
            public boolean test(Integer value) {
                return value % 2 == 0;
            }
        };
        System.out.println("predicate1.test(5) = " + predicate1.test(5));
        System.out.println("predicate1.test(10) = " + predicate1.test(10));
        
        Predicate<Integer> predicate2 = value -> value % 2 == 0;
        System.out.println("predicate2.test(5) = " + predicate2.test(5));
        System.out.println("predicate2.test(10) = " + predicate2.test(10));

        Function<Integer, Boolean> function = value -> value % 2 == 0;
        System.out.println("function.apply(5) = " + function.apply(5));
        System.out.println("function.apply(10) = " + function.apply(10));
    }
    
}
