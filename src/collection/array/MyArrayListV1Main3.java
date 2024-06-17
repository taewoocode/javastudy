package collection.array;

public class MyArrayListV1Main3 {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        list.add( "asd" );
        list.add( "asd" );
        list.add( "asd" );
        list.add( "asd" );

        System.out.println( "addLast" );
        list.add( 3, "addList");
        System.out.println(list);

        System.out.println( "addFirst" );
        list.add( 0, "addFirst" );
        System.out.println( list );

        Object removed1 = list.remove( 4 );
        System.out.println( "removed(4) = " + removed1 );
        System.out.println( list );


    }
}
