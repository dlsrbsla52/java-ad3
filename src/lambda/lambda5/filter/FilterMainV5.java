package lambda.lambda5.filter;

import java.util.List;

import static lambda.lambda5.filter.GenericFilter.filter;

public class FilterMainV5 {
    static void main() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // 짝수만 거르기
        List<Integer> evenNumbers = filter(numbers, number -> number % 2 == 0);
        System.out.println("evenNumbers = " + evenNumbers);
        
        // 홀수만 거르기
        List<Integer> oddNumbers = filter(numbers, number -> number % 2 == 1);
        System.out.println("oddNumbers = " + oddNumbers);
        
        // 문자 사용 필터
        List<String> strings = List.of("A", "BB", "CCCC", "DDDDDD", "EEEEEEE", "F", "G", "H", "I", "J");
        System.out.println("filter(strings, str -> str.length() >= 2) = " + filter(strings, str -> str.length() >= 2));
    }
}
