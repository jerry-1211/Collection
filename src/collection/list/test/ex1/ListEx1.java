package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(90);
        arrayList.add(80);
        arrayList.add(70);
        arrayList.add(60);
        arrayList.add(50);

        int total = 0 ;
        for (int i = 0; i < arrayList.size(); i++) {
            total  += arrayList.get(i);
        }

        double average = (double) total / arrayList.size();
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);

    }
}
