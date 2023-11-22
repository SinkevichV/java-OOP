package home;

import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new HotDrink("qwe", 123, 100));
        productList.add(new HotDrink("qwe", 200, 150));
        productList.add(new HotDrink("zxcg", 500, 1000));
        productList.add(new HotDrink("qaffwe", 123, 10));
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct(1000));
        
    }
}