package collection.link;

public class MyLinkedListV2Main {

    public static void main(String[] args) {
        MyLinkdeListV2 list = new MyLinkdeListV2();
        //마지막에 추가 O(n)
        list.add( "a" );
        list.add( "b" );
        list.add( "c" );
        System.out.println( list );

        //첫 번째 항목에 추가, 삭제
        // O(1)
        System.out.println( "첫 번째 항목에 추가" );
        list.add( 0, "D" );
        System.out.println( list );

        System.out.println( "첫 번째 항목에서 삭제" );
        list.remove( 0 );
        System.out.println( list );

        //중간 항목에 추가, 삭제 //O(n)
        System.out.println( "중간 항목에 추가" );
        list.add( 1, "e" );
        System.out.println( list );

        System.out.println( "중간 항목에 삭제" );
        list.remove( 1 ); //O(n)




    }
}
