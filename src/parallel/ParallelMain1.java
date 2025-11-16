package parallel;

import java.util.stream.IntStream;

import static util.MyLogger.*;

public class ParallelMain1 {

    static void main() {
        long startTime = System.currentTimeMillis();

        int sum = IntStream.rangeClosed(1, 8)
            .map(HeavyJob::heavyTask)
            .reduce(0, Integer::sum);

        long endtime = System.currentTimeMillis();
        log("time : " + (endtime - startTime) + "ms, sum : " + sum);
    }
}
