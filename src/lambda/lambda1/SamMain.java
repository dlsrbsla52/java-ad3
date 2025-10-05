package lambda.lambda1;

public class SamMain {
    static void main() {
        SamInterface samInterface = () -> {
            System.out.println("sam");
        };
        samInterface.run();
        
//        람다를 할당할 수 없음 컴파일 에러
//        NotSamInterface notSamInterface () -> {
//            System.out.println("not sam");
//        };
    }
}
