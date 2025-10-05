package lambda.lambda5.map;

import java.util.List;

public class MapMainV5 {
    static void main() {
        List<String> list = List.of("apple", "banana", "orange");
        
        // String -> String
        List<String> numbers = GenericMapper.map(list, s -> s.toUpperCase());
        System.out.println("numbers = " + numbers);
        
        // String -> Integer
        List<Integer> lengths = GenericMapper.map(list, s -> s.length());
        System.out.println("lengths = " + lengths);
        
        // Integer -> String
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> strings = GenericMapper.map(integers, n -> "*".repeat(n));
        System.out.println("strings = " + strings);
    }
}
