package functional;

import java.util.function.Function;

public class SideEffectMain2 {

    static void main() {

        Function<Integer, Integer> func = x -> {
            int result = x * 2;

            // 부수 효과(Side Effect)
            System.out.println("x = " + x + ", result = " + result);
            return result;
        };
        func.apply(10);
        func.apply(10);
    }
}
