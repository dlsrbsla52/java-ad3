package lambda.lambda4;

import java.util.function.IntFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;

public class PrimitiveFunction {

    static void main(String[] args) {
        // 기본형 매개변수, IntFunction, LongFunction, DoubleFunction
        IntFunction<String> function = x -> "숫자 : " + x;
        System.out.println("function.apply(100) : " + function.apply(100));
        
        // 기본형 반환, ToIntFunction, ToLongFunction, ToDoubleFunction
        ToIntFunction<String> toIntFunction = x -> x.length();
        System.out.println(toIntFunction.applyAsInt("Hello"));
        
        // 기본형 매개변수, 기본형 반환
        IntToLongFunction intToLongFunction = x -> x * 100L;
        System.out.println(intToLongFunction.applyAsLong(10));
        
        // IntUnaryOperator
        IntUnaryOperator intUnaryOperator = x -> x * 2;
        System.out.println(intUnaryOperator.applyAsInt(5));
        
        // 기타, IntConsumer, IntSupplier, IntPredicate
    }
    
}
