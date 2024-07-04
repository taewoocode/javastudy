package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        Map<String, Integer> productMap = new HashMap<>();
        for (String[] product : productArr) {
            String key;
            productMap.put( product[0], Integer.valueOf( product[1] ) );

        }
        for (String key : productMap.keySet()) {
            System.out.println( "제품 :" + key + ", 가격:" + productMap.get( key ) );
        }
    }
}
