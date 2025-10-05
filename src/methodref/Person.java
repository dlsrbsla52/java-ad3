package methodref;

public class Person {
    
    private String name;

    public Person() {
        this("Unknown");
    }

    public Person(String name) {
        this.name = name;
    }
    
    // 정적 메서드
    public static String greeting() {
        return "Hello, World!";
    }
    
    // 정적 메서드
    public static String greetingWithName(String name) {
        return "Hello, World!" + name;
    }
    
    public String getName() {
        return name;
    }
    
    // 인스턴스 메서드
    public String introduce() {
        return "My name is " + name;
    }
    
    // 인스턴스 메서드
    public String introduceWithNumber(int number) {
        return "My name is " + name + "!" + number;
    }
}
