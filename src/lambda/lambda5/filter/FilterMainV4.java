package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static lambda.lambda5.filter.IntegerFilter.*;

public class FilterMainV4 {
    static void main() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // 짝수만 거르기
        List<Integer> evenNumbers = filter(numbers, number -> number % 2 == 0);
        System.out.println("evenNumbers = " + evenNumbers);
        
        // 홀수만 거르기
        List<Integer> oddNumbers = filter(numbers, number -> number % 2 == 1);
        System.out.println("oddNumbers = " + oddNumbers);
    }
}
