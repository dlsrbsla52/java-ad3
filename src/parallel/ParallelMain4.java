package parallel;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

import static util.MyLogger.log;

public class ParallelMain4 {

    static void main() {
        int processorsCount = Runtime.getRuntime().availableProcessors();
        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        log("processorsCount = " + processorsCount + ", commonPool = " + commonPool.getParallelism());

        long startTime = System.currentTimeMillis();

        int sum = IntStream.rangeClosed(1, 8)
            .parallel()
            .map(HeavyJob::heavyTask)
            .reduce(0, Integer::sum);

        long endtime = System.currentTimeMillis();
        log("time : " + (endtime - startTime) + "ms, sum : " + sum);
    }
}
