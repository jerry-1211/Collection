package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> list=  new ArrayList<Item>();

    public void addItem(Item item) {
        list.add(item);
    }

    public void displayItems() {
        int total = 0;

        for (Item item : list) {
            total += item.getPrice();
        }
        for (Item item : list) {
            System.out.print(item.getName() + ", 합계 : " + item.getPrice());
            System.out.println();
        }

        System.out.println("전체 가격 합 : " + total);
    }
}
