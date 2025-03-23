package collection.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"},
                {"JPA", "30000"}};

        Map<String, Integer> productMap = new HashMap<>();

        for (String[] strings : productArr) {
            productMap.put(strings[0],Integer.parseInt(strings[1]));
        }

        for (String product : productMap.keySet()) {
            System.out.println(product  + " : " + productMap.get(product));
        }

    }
}
