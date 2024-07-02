package collection.set;

public class MyHashSetV2Main1 {
    public static void main(String[] args) {
        MyHashSetV2 myHashSetV2 = new MyHashSetV2( 10 );
        myHashSetV2.add( "A" );
        myHashSetV2.add( "B" );
        myHashSetV2.add( "C" );
        myHashSetV2.add( "D" );
        myHashSetV2.add( "AB" );
        myHashSetV2.add( "SET" );
        System.out.println( myHashSetV2 );

        System.out.println( "\"A\".hashCode() = " + "A".hashCode() );


    }
}
