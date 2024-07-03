package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationTest {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>( List.of( 1, 2, 3, 4, 5 ) );
        Set<Integer> set2 = new HashSet<>( List.of( 3, 4, 5, 6, 7 ) );

        //합집합
        HashSet<Object> union = new HashSet<>(set1);
        union.addAll( set2 );

        //교집합
        HashSet<Object> intersection = new HashSet<>(set1);
        intersection.retainAll( set2 );
        
        //차집합
        HashSet<Object> difference = new HashSet<>(set1);
        difference.removeAll( set2 );

        System.out.println( "합집합" + union );
        System.out.println( "교집합" + intersection );
        System.out.println( "차집합" + difference );

    }
}
