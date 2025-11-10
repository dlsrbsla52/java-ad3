package stream.collectors;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DownStreamMain2 {


    static void main() {
        List<Student> students = List.of(
            new Student("kim", 1, 85),
            new Student("Park", 1, 70),
            new Student("Lee", 2, 70),
            new Student("Han", 2, 90),
            new Student("Hoon", 3, 90),
            new Student("Ha", 3, 85),
            new Student("kim", 1, 89)
        );

        // 1 단계 : 학년별로 학생들을 그룹화 해라.
        Map<Integer, List<Student>> collect1 = students.stream()
            .collect(Collectors.groupingBy(Student::grade));
        System.out.println("collect1 = " + collect1);

        // 2 단계 : 학년별로 가장 점수가 높은 학생을 구해라. reducing 사용
        Map<Integer, Optional<Student>> collect2 = students.stream()
            .collect(Collectors.groupingBy(
                Student::grade,
                Collectors.reducing((s1, s2) -> s1.score() > s2.score() ? s1 : s2)
            ));
        System.out.println("collect2 = " + collect2);


        // 3 단계 : 학년별로 가장 점수가 높은 학생을 구해라. maxBy 사용
        Map<Integer, Optional<Student>> collect3 = students.stream()
            .collect(Collectors.groupingBy(
                Student::grade,
//                Collectors.maxBy((s1, s2) -> s1.score() > s2.score() ? 1 : -1)
                Collectors.maxBy(Comparator.comparingInt(Student::score))
            ));
        System.out.println("collect3 = " + collect3);

        // 4 단계 : 학년별로 가장 점수가 높은 학생의 이름을 구해라 (collectingAdnThen + maxBy 사용)
        // 학년별 그룹 -> 그룹별 가장 점수가 높은 학생 -> 그룹별 최고점 학생 -> 그룹별 최고점 학생 이름
        Map<Integer, String> collect4 = students.stream()
            .collect(Collectors.groupingBy(
                Student::grade,
                Collectors.collectingAndThen(
                    Collectors.maxBy(Comparator.comparingInt(Student::score)),
                    student -> {
                        return student.get().name();
                    }
                )
            ));
        System.out.println("collect4 = " + collect4);
    }
}
