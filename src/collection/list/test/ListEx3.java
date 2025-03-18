package collection.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arrayList = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while(true){
            int tmp = scanner.nextInt();
            if (tmp ==0){
                break;
            }
            arrayList.add(tmp);
        }

        int total = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            total += arrayList.get(i);
        }

        double average = (double) total / arrayList.size();
        System.out.println("입력한 정수의 합계 : " + total );
        System.out.println("입력한 정수의 평균 : " + average );

    }
}
