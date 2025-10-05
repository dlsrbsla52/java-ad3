package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

// static factory 추가
public class MyStreamV3<T> {
    private List<T> integerList;
    
    private MyStreamV3(List<T> integerList) {
        this.integerList = integerList;
    }
    
    public static <T> MyStreamV3<T> of(List<T> integerList) {
        return new MyStreamV3<>(integerList);
    }
    
    public MyStreamV3 <T> filter(Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();
        for (T e : integerList) {
            if(predicate.test(e)) {
                filtered.add(e);
            }
        }
        return MyStreamV3.of(filtered);
    }
    
    public <R> MyStreamV3 <R> map(Function<T, R> mapper){
        List<R> mapped = new ArrayList<>();
        for (T e : integerList) {
            mapped.add(mapper.apply(e));
        }
        return MyStreamV3.of(mapped);
    }
    
    public List<T> toList() {
        return integerList;
    }
    
    public void forEach(Consumer<T> consumer) {
        for (T e : integerList) {
            consumer.accept(e);
        }
    }
    
    // 추가
    public T getFirst() {
        return integerList.getFirst();
    }
}
