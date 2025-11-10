package Optional;

import java.util.HashMap;
import java.util.Map;

public class OptionalStartMain1 {
    
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
        String name = findNameById(id);
        
        // 1. NullPointException 유발
//        System.out.println("name = " + name.toUpperCase());
        
        // 2. if 문을 활용한 null 체크 필요
        if (name != null) {
            System.out.println(id + ": " + name.toUpperCase());
        } else {
            System.out.println(id + ": " + "UNKNOWN");
        }
    }
    
    static String findNameById(Long id) {
        return map.get(id);
    }
}
