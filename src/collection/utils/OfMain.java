package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        // 편리한 불변 컬렉션 생성 (변경 불가능)
        List<Integer> list = List.of(1,2,3);
        System.out.println("list = " + list);

        Set<Integer> set = Set.of(1,2,3);
        System.out.println("set = " + set);

        Map<Integer,String>  map = Map.of(1,"one",2,"two");
        System.out.println("map = " + map);
        System.out.println("list class = " + list.getClass());

        // list.add(1);  이런거 안됨 !!

    }
}
