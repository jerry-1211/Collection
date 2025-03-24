package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);

        // 이렇게 불변으로 새로운 객체 만들면 가변 리스트로 가능
        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);
        System.out.println("mutableList = " + mutableList);
        
        
        // 다시 불변으로 변경
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        // unmodifiableList.add(1); 불가능
        System.out.println("unmodifiableList = " + unmodifiableList);

    }
}
