package lambda.lambda5.mystream;

import lambda.Procedure;
import lambda.ex2.MyPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStreamV1 {
    private List<Integer> integerList;
    
    public MyStreamV1(List<Integer> integerList) {
        this.integerList = integerList;
    }
    
    public MyStreamV1 filter(Predicate<Integer> predicate) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer e : integerList) {
            if(predicate.test(e)) {
                filtered.add(e);
            }
        }
        return new MyStreamV1(filtered);
    }
    
    public MyStreamV1 map(Function<Integer, Integer> mapper){
        List<Integer> mapped = new ArrayList<>();
        for (Integer e : integerList) {
            mapped.add(mapper.apply(e));
        }
        return new MyStreamV1(mapped);
    }
    
    public List<Integer> toList() {
        return integerList;
    }
}
