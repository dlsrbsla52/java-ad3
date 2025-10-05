package lambda.lambda3;

import java.util.function.Function;

// java가 기본으로 제공하는 Function 사용
public class TargetType2 {

    static void main() {
        Function<String, String> upperCase = s -> s.toUpperCase();
        System.out.println("result1 = " + upperCase.apply("hello"));
        
        Function<Integer, Integer> square = n -> n * n;
        System.out.println("result2 = " + square.apply(3));
    }
    
}
