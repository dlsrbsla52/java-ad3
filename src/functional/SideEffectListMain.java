package functional;

import java.util.ArrayList;
import java.util.List;

public class SideEffectListMain {

    static void main() {
        List<String> list1 = new ArrayList<>();
        list1.add("apple"); // apple -> apple_complete
        list1.add("banana"); // banana -> banana_complete

        System.out.println("before list1 = " + list1);
        changeList1(list1);
        System.out.println("after list1 = " + list1);

        List<String> list2 = new ArrayList<>();
        list2.add("apple"); // apple -> apple_complete
        list2.add("banana"); // banana -> banana_complete

        System.out.println("before list2 = " + list2);
        List<String> result = changeList2(list2);
        System.out.println("after list2 = " + list2);
        System.out.println("result = " + result);
    }

    private static void changeList1(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + "_complete");
        }
    }

    private static List<String> changeList2(List<String> list2) {
        List<String> newList = new ArrayList<>();
        for (String s : list2) {
            newList.add(s + "_complete");
        }
        return newList;
    }

}
