package lambda.lambda3;

public class GenericMain6 {
    
    static void main(String[] args) {
        GenericFunction<String, String> upperCase = s -> s.toUpperCase();
        GenericFunction<String, Integer> add = str -> str.length();
        GenericFunction<Integer, Integer> square = n -> n * n;
        GenericFunction<Integer, Boolean> isEven = num -> num % 2 == 0;

        System.out.println("result1 = " + upperCase.apply("hello"));
        System.out.println("result2 = " + add.apply("hello"));
        System.out.println("result3 = " + square.apply(3));
        System.out.println("result4 = " + isEven.apply(3));
    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T s);
    }
}
