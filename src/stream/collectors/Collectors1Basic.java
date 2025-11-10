package stream.collectors;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors1Basic {

    static void main() {
        // 기본 기능
        List<String> list = Stream.of("Java", "Spring", "JPA")
            .collect(Collectors.toList());
        list.add("hello");
        System.out.println("list = " + list);


        List<Integer> unmodifiableList = Stream.of(1, 2, 3)
            .collect(Collectors.toUnmodifiableList());
        System.out.println("unmodifiableList = " + unmodifiableList);

        Set<Integer> set = Stream.of(1, 2, 2, 3, 3, 3)
            .collect(Collectors.toSet());
        System.out.println("set = " + set);

        // 타입 지정
        TreeSet<Integer> treeSet = Stream.of(3, 4, 5, 2, 1)
            .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("treeSet = " + treeSet);


    }
}
