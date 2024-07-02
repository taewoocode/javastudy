package collection.set.member;

import collection.set.MySet;

public class MyHashSetV3Main {
    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>();
        set.add( "A" );
        set.add( "B" );
        set.add( "C" );
        System.out.println( set );

        String searchValue = "A";
        boolean result = set.contains( searchValue );
        System.out.println( result );

        MyHashSetV3<Integer> set2 = new MyHashSetV3<>();
        set2.add( 1 );

    }
}
