package parallel.forkjoin;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

import static util.MyLogger.log;

public class ForkJoinMain2 {

    static void main() {
//        명시적으로 보여주기 위한 코드
//        int processorsCount = Runtime.getRuntime().availableProcessors();
//        ForkJoinPool commonPool = ForkJoinPool.commonPool();
//        log("processorsCount = " + processorsCount + ", commonPool = " + commonPool.getParallelism());

        List<Integer> data = IntStream.rangeClosed(1, 8)
            .boxed()
            .toList();

        log("[생성] " + data);

        // ForkJoinPool 생성 및 작업 수행
        SumTask task = new SumTask(data); // [1 ~ 8]
        Integer result = task.invoke(); // 공용 풀 사용
        log("최종 결과:" + result);
    }
}
