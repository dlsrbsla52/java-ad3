package lambda.ex1;

import lambda.MyFunction;

public class M5Return {

    public static void main(String[] args) {
        MyFunction add = getOperator("add");
        System.out.println("1 + 2 = " + add.apply(1, 2));
        
        MyFunction sub = getOperator("sub");
        System.out.println("1 - 2 = " + sub.apply(1, 2));
        
        MyFunction o = getOperator("xxx");
        System.out.println("1 xxx 2 = " + o.apply(1, 2));
    }
    
    public static MyFunction getOperator(String operator){
        switch (operator) {
            case "add":
                return (a, b) -> a + b;
            case "sub":
                return (a, b) -> a - b;
            default:
                return (a, b) -> 0; // 잘못된 연산자일 경우 o 반환
        }
    }
    
}
