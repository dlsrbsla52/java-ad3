package stream.collectors;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Collectors4Summing {

    static void main() {
        Long count1 = Stream.of(1, 2, 3)
            .collect(Collectors.counting());
        System.out.println("count1 = " + count1);

        Long count2 = Stream.of(1, 2, 3)
            .count();
        System.out.println("count2 = " + count2);

        Double average1 = Stream.of(1, 2, 3)
            .collect(Collectors.averagingInt(i -> i));
        System.out.println("average1 = " + average1);

        double average2 = Stream.of(1, 2, 3)
            .mapToInt(i -> i)
            .average()
            .getAsDouble();
        System.out.println("average2 = " + average2);

        double average3 = IntStream.of(1, 2, 3)
            .average().getAsDouble();
        System.out.println("average3 = " + average3);


        // 통계
        IntSummaryStatistics state = Stream.of("Apple", "Banana", "Tomato")
            .collect(Collectors.summarizingInt(String::length));

        System.out.println("state.getSum() = " + state.getSum());
        System.out.println("state.getSum() = " + state.getSum());
        System.out.println("state.getMax() = " + state.getMax());
        System.out.println("state.getMin() = " + state.getMin());
        System.out.println("state.getAverage() = " + state.getAverage());
    }
}
