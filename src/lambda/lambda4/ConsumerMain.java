package lambda.lambda4;

import java.util.function.Consumer;

public class ConsumerMain {

    static void main() {
        Consumer<String> consumer1 = new Consumer<>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer1.accept("Hello Consumer!");
        
        Consumer<String> consumer2 = s -> System.out.println(s);
        consumer2.accept("Hello Consumer!");
    }
    
}
