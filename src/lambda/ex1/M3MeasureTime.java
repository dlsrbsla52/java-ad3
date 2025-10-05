package lambda.ex1;

import lambda.Procedure;

import java.util.Arrays;

public class M3MeasureTime {

    // 공통 : 실행 시간 특정 메서드
    public static void measure(Procedure p){
        long start = System.currentTimeMillis();
        p.run();
        long end = System.currentTimeMillis();
        System.out.println("실행 시간 : " + (end - start) + "ms");
    }

    public static void main(String[] args) {
        // 1. 익명 클래스로 1부터 N까지 합 구하기
        measure(new Procedure() {
            @Override
            public void run() {
                int N = 100;
                long sum = 0;
                for (int i = 0; i < N; i++) {
                    sum += i;
                }
                System.out.println("[1 부터 " + N + "까지 합 : " + sum);
            }
        });

        // 2. 익명 클래스로 배열 정렬
        measure(new Procedure() {
            @Override
            public void run() {
                int[] arr = { 4,3,2,1 };
                System.out.println("원본 배월: " + Arrays.toString(arr));
                Arrays.sort(arr);
                System.out.println("배열 정렬: " + Arrays.toString(arr));
            }
        });
    }
    
    
}
