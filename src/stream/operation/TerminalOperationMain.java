package stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperationMain {
    static void main() {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);
        
        // Collectors는 뒤에서 더 자세히 (복잡한 수집이 필요할 때 사용)
        System.out.println("1. collect - List 수집");
        List<Integer> evenNumbers1 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("짝수 리스트: " + evenNumbers1);
        System.out.println();

        System.out.println("2. toList() - Java 16 이상");
        List<Integer> evenNumbers2 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("짝수 리스트: " + evenNumbers2);
        System.out.println();

        System.out.println("3. toArray - 배열로 반환");
        Integer[] evenNumbers3 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toArray(Integer[]::new);
        System.out.println("짝수 배열: " + Arrays.toString(evenNumbers3));
        System.out.println();

        System.out.println("4. forEach - 각 요소 처리");
        numbers.stream()
                .limit(5)
                .forEach(n -> System.out.println(n + " "));
        System.out.println();

        System.out.println("5. count - 요소 개수");
        long count = numbers.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println("5 보다 큰 갯수: " + count);
        System.out.println();

        System.out.println("6. reduce - 요소들의 합");
        System.out.println("초기값이 없는 reduce");
        Optional<Integer> sum1 = numbers.stream()
                .reduce(Integer::sum);
        System.out.println("합계(초기값 없음)" + sum1.get());

        System.out.println("6. reduce - 요소들의 합");
        System.out.println("초기값이 있는 reduce");
        int sum2 = numbers.stream()
                .reduce(100, Integer::sum);
        System.out.println("합계(초기값 없음)" + sum2);

        System.out.println("7. min - 최소값");
        Optional<Integer> min = numbers.stream()
                .min(Integer::compareTo);
        System.out.println("최소값: " + min.get());

        System.out.println("8. max - 최대값");
        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);
        System.out.println("최대값: " + max.get());

        System.out.println("9. findFirst - 첫 번째 요소");
        Optional<Integer> findFirst = numbers.stream()
                .filter(n -> n > 5)
                .findFirst();
        System.out.println("findFirst = " + findFirst.get());
        System.out.println();

        System.out.println("10. findAny - 아무거나 하나 찾기");
        Optional<Integer> findAny = numbers.stream()
                .filter(n -> n > 5)
                .findAny();
        System.out.println("findFirst = " + findAny.get());
        System.out.println();


        System.out.println("11. anyMatch - 요소 중에 하나라도 조건에 맞는지 확인");
        boolean anyMatch = numbers.stream()
                .anyMatch(n -> n > 5);
        System.out.println("anyMatch = " + anyMatch);
        System.out.println();

        System.out.println("12. allMatch - 모든 요소가 조건에 맞는지 확인");
        boolean allMatch = numbers.stream()
                .allMatch(n -> n > 0);
        System.out.println("allMatch = " + allMatch);
        System.out.println();

        System.out.println("13. noneMatch - 모든 요소가 조건에 맞지 않는지 확인");
        boolean noneMatch = numbers.stream()
                .noneMatch(n -> n < 0);
        System.out.println("noneMatch = " + noneMatch);
        System.out.println();
    }
}
