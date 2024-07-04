package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int addquantity) {
        Integer existingQuantity = cartMap.getOrDefault( product, 0 );
        //없으면 넣고 있으면 +
        cartMap.put( product, existingQuantity + addquantity );
    }

    public void printAll() {
        System.out.println( "==모든 상품 출력==" );
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println( "상품 : " + entry.getKey() + "수량: " + entry.getValue() );

        }
    }

    public void minus(Product product, int minusQuantity) {
        Integer existingQuantity = cartMap.getOrDefault( product, 0 );
        int newQuantity = existingQuantity - minusQuantity;
        if (newQuantity <= 0) { //0보다 작으면
            cartMap.remove( product ); //상품제거
        } else {
            cartMap.put( product, newQuantity ); //product에 새로운 값 갱신
        }
    }
}
