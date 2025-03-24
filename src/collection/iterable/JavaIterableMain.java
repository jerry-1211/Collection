package collection.iterable;

import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        printAll(list.iterator());
        printAll(set.iterator());

        foreach(list);
        foreach(set);
    }

    // iterable
    private static void foreach(Iterable<Integer> iterable) {
        System.out.println("iterable.getClass() = " + iterable.getClass());
        for (Integer ls : iterable) {
            System.out.println("ls = " + ls);
        }
    }

    // iterator
    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator.getClass() = " + iterator.getClass());
        while(iterator.hasNext()){
            System.out.println("iterator.next() = " + iterator.next());
        }
    }
}
