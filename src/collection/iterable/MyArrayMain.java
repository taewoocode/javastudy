package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray( new int[]{1, 2, 3, 4} );
        Iterator<Integer> iterator = myArray.iterator();
        System.out.println( "iterator 사용" );

        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println( "value = " + value );
        }

        //추가
        System.out.println( "for-each 사용" );
        for (Integer value : myArray) {
            System.out.println( "value = " + value );
        }
        myFriend( "대박" );
    }

    public static String myFriend(String friend) {
        System.out.println( "박대박" );
        return friend;
    }
}
