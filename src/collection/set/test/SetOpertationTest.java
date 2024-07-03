package collection.set.test;

import java.util.HashSet;
import java.util.List;

public class SetOpertationTest {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>( List.of( 1, 2, 3, 4, 5 ) );
        HashSet<Integer> set2 = new HashSet<>( List.of( 3, 4, 5, 6, 7 ) );

        HashSet<Integer> union = new HashSet<>( set1 );
        for (Integer s : set2) {
            union.add( s );
        }

        HashSet<Integer> intersection = new HashSet<>();
        for (Integer s : set1) {
            if (set2.contains( s )) {
                intersection.add( s );
            }
        }

        HashSet<Object> difference = new HashSet<>(set1);
        for (Integer s : set2) {
            difference.remove( s );
        }
        System.out.println( union );
        System.out.println(intersection);
        System.out.println( difference );
    }

}
