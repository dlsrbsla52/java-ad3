package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamLoopMain {
    static void main() {
        // 짝수만 남기고, 남음 값의 2배를 반환
        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)
        );
        
        // 점수가 80점 이상인 학생의 이름을 추출해라.
        List<String> result = MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .map(s -> s.getName())
                .toList();

        // 외부 반복
        for (String s : result) {
            System.out.println("name : " + s);
        }
        
        // 추가
        MyStreamV3.of(students)
            .filter(s -> s.getScore() >= 80)
            .map(s -> s.getName())
            .forEach(s -> System.out.println("name = " + s));
    }
}
