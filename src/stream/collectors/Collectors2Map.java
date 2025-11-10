package stream.collectors;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors2Map {

    static void main() {
        Map<String, Integer> map = Stream.of("Apple", "Banana", "Tomato")
            .collect(Collectors.toMap(name -> name, name -> name.length()));
        System.out.println("map = " + map);

//        중복 예외 발생 map에는 중복된 키가 적용될 수 없기 때문
//        Map<String, Integer> map2 = Stream.of("Apple", "Apple", "Tomato")
//            .collect(Collectors.toMap(
//                name -> name,
//                name -> name.length()
//                ));
//        System.out.println("map2 = " + map2);

        // 키 중복 대안 (병합)
        Map<String, Integer> map3 = Stream.of("Apple", "Apple", "Tomato")
            .collect(Collectors.toMap(
                name -> name,
                String::length,
                Integer::sum
                ));
        System.out.println("map3 = " + map3);

        // Map의 타입을 지정
        Map<String, Integer> map4 = Stream.of("Apple", "Apple", "Tomato")
            .collect(Collectors.toMap(
                name -> name,
                String::length,
                Integer::sum,
                LinkedHashMap::new
            ));
        System.out.println("map4 = " + map4.getClass());
    }
}
