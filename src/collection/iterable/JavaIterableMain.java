package collection.iterable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class JavaIterableMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add( 1 );
        list.add( 2 );
        list.add( 3 );
        printAll( list.iterator() );
        foreach( list );

        Iterator<Integer> iterator = list.iterator();

        HashSet<Integer> set = new HashSet<>();
        set.add( 1 );
        set.add( 2 );
        set.add( 3 );
        printAll( set.iterator() );
        foreach( set );
    }

   /* private static void foreach(HashSet<Integer> set) {
        for (Integer i : set) {
            System.out.println( "i = " + i );
        }
    }*/

    private static void foreach(Iterable<Integer> iterable) { //Iterable로 모든 자료구조를 다 받는다.
        System.out.println( "iterable = " + iterable.getClass() );
        for (Integer i : iterable) {
            System.out.println( "i = " + i );
        }
    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println( "iterator = " + iterator.getClass() );
        while (iterator.hasNext()) {
            System.out.println( "iterator.next() = " + iterator.next() );
        }
    }

    private static void foreach(Iterator<Integer> iterator) {
            System.out.println( "iterator = " + iterator.getClass() );

    }
}
