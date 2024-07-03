package collection.set.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new LinkedHashSet<>( List.of( inputArr ) ); //입력한 순서를 보장하는 LinkedHashSet

        for (Integer s : set) {
            System.out.println( s );
        }

    }
}
