package optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalStartMain2 {
    
    private static final Map<Long, String> map = new HashMap<>();
    
    static {
        map.put(1L, "kim");
        map.put(2L, "Seo");
    }

    static void main() {
        findAndPrint(1L);
        findAndPrint(3L);
    }
    
    // 이름이 있으면 이름을 대문자로 출력, 없으면 "UNKNOWN"을 출력 해라.
    static void findAndPrint(Long id) {
        String name = findNameById(id).orElse("UNKNOWN");
        System.out.println("name = " + name.toUpperCase());
    }
    
    static Optional<String> findNameById(Long id) {
        String findName = map.get(id);
        Optional<String> optional = Optional.ofNullable(findName);
        return optional;
    }
}
