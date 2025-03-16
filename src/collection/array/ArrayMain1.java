package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int [] arr = new int[5];
        System.out.println("== index 입력 : O(1) ==");
        System.out.println(Arrays.toString(arr));

        System.out.println("== index 조회 : O(1) ==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        System.out.println("== 배열 검색 : O(n) == ");
        int value = 10 ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value){
                System.out.println("value의 위치 : " + i );
            }
        }

    }
}
