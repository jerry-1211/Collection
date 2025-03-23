package collection.map.test;

import java.util.Arrays;
import java.util.HashMap;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        String[] arrStr = text.split(" ");

        System.out.println(Arrays.toString(arrStr));

        HashMap<String, Integer> map = new HashMap<>();

        for (String string : arrStr) {
//            Integer count = map.get(string);
//            if(count == null){
//                count = 0 ;
//            }
//            count += 1 ;
//            map.put(string, count);
            map.put(string, map.getOrDefault(string,0) + 1);
        }
        System.out.println("map = " + map);
    }
}
