package collection.utils;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add( 1 );
        list.add( 2 );
        list.add( 3 );
        list.add( 4 );
        list.add( 5 );

        Integer max = Collections.max( list );
        Integer min = Collections.min( list );
        System.out.println( max );
        System.out.println( min );

        System.out.println( "list = " + list );
        Collections.shuffle( list ); //random하게 정렬을 섞어버림
        System.out.println( "shufflie list = " + list );

        Collections.sort( list );
        System.out.println( "sort list" + list );

        Collections.reverse( list );
        System.out.println( "reverse list" + list );

    }
}
