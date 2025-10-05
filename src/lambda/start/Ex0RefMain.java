package lambda.start;

public class Ex0RefMain {
    public static void helloJava() {
        hello("Hello Java");
    }
    public static void helloSpring() {
        hello("Hello Spring");
    }
    
    public static void hello(String arg) {
        System.out.println("프로그램 시작");
        System.out.println(arg);
        System.out.println("프로그램 종료");
    }

    static void main() {
        hello("Hello Java");
        hello("Hello Spring");
    }
}
