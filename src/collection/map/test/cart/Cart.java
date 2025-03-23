package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class   Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int n) {
        cartMap.put(product, (cartMap.getOrDefault(product,0) + n));
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Product product : cartMap.keySet()) {
            System.out.println(product + " 수량 :" +  cartMap.get(product));
        }
    }

    public void minus(Product product, int n) {
        cartMap.put(product, (cartMap.getOrDefault(product,0) - n));
        if (cartMap.get(product) <= 0 ){
            cartMap.remove(product);
        }
    }
}

