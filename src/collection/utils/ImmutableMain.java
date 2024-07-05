package collection.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        List<Integer> list = List.of( 1, 2, 3 );

        //가변리스트
        ArrayList<Integer> mutableList = new ArrayList<>( list );
        mutableList.add( 4 );
        System.out.println( "mutableList = " + mutableList );
        System.out.println( "mutableList class = " + mutableList.getClass() );

        //불변리스트
        Collection<Integer> unmodifiableList = Collections.unmodifiableCollection( mutableList );
        System.out.println( "unmodifiableList = " + unmodifiableList.getClass() );
        //unmodifiableList.add( 5 ); //예외처리



    }
}
