package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};
        // 자바 9 이상 부터는 List.of()를 쓴다.  (Array.asList() 말고)
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

//        Set<Integer> set = new LinkedHashSet<>();
//        for (Integer x : inputArr) {
//            set.add(x);
//        }

        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
