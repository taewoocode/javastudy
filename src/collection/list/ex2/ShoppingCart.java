package collection.list.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    /*public ShoppingCart(List<Item> items){
        this.items = items;
    }*/

    public void add(Item item) {
        items.add( item );
    }

    public void displayItem() {
        System.out.println( "장바구니 상품 출력" );
        for (Item item : items) {
            int totalPrice = 0;
            System.out.println( "상품먕: " + item.getName() + "합계: " + item.getTotalPrice() );
            totalPrice += item.getTotalPrice();
        }
        System.out.println( "전체 가격 합: " + getTotalPrice() );
    }

    private int getTotalPrice() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
