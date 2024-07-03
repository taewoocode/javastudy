package collection.set.test;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new HashSet<>();
        for (Integer s : inputArr) {
            set.add( s ); //set구조를 이용하여 중복을 다 제거함 O(1)
        }
        for (Integer s : set) {
            System.out.println( " s = " + s );
        }
    }
}
