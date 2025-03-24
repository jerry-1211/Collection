package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EmptyListMain {
    public static void main(String[] args) {
        // 가변 리스트
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        // 불변 리스트
        List<Integer> list4 = List.of();
        System.out.println("list4.getClass() = " + list4.getClass());


    }
}
