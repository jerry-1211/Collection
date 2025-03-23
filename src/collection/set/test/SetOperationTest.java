package collection.set.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SetOperationTest {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("합집합 : " + union);


        HashSet<Integer> intersecation = new HashSet<>(set1);
        intersecation.retainAll(set2);
        System.out.println("교집합 : " +intersecation);

        HashSet<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("차집합 : " + difference);

    }
}
