package lambda.lambda5.mystream;

import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.map.GenericMapper;

import java.util.ArrayList;
import java.util.List;

import static lambda.lambda5.filter.GenericFilter.*;
import static lambda.lambda5.map.GenericMapper.*;

public class Ex2_Student {
    static void main() {
        // 점수가 80점 이상인 학생의 이름을 추출해라.
        List<Student> students = List.of(
            new Student("Apple", 100),
            new Student("Banana", 80),
            new Student("Berry", 50),
            new Student("Tomato", 40)
        );
        
        List<String> directResult = direct(students);
        System.out.println("directResult = " + directResult);
        
        List<String> lambdaResult = lambda(students);
        System.out.println("lambdaResult = " + lambdaResult);
    }

    private static List<String> direct(List<Student> students) {
        List<String> result = new ArrayList<>();

        for (Student student : students) {
            if(student.getScore() >= 80) {
                result.add(student.getName());
            }
        }
        
        return result;
    }

    private static List<String> lambda(List<Student> students) {
        List<Student> mapper = filter(students, s -> s.getScore() >= 80);
        List<String> result = map(mapper, s -> s.getName());
        return result;
    }
}
