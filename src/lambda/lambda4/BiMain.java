package lambda.lambda4;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiMain {
    static void main() {
        BiFunction<Integer, Integer, Integer> add1 = (x, y) -> x + y;
        System.out.println("Sum = " + add1.apply(1, 2));

        BiConsumer<String, Integer> repeat = (c, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println(c);
            }
            System.out.println();
        };
        
        repeat.accept("*", 5);

        BiPredicate<Integer, Integer> isEven = (a, b) -> a > b;
        System.out.println("isGreater : " + isEven.test(10, 5));
    }
}
