package collection.link;

public class MyLinkedListV1Main {
    public static void main(String[] args) {
        MyLinkdeListV1 list = new MyLinkdeListV1();
        System.out.println( "===데이터 추가====" );
        System.out.println( list );
        list.add( "a" );
        System.out.println( list );
        list.add( "b" );
        System.out.println( list );
        list.add( "c" );
        System.out.println( list );


        System.out.println( "====기능 사용====" );
        System.out.println( "list.size() = " + list.size() );
        System.out.println( "list.get(1) = " + list.get( 1 ) );

        //c라는 문자 찾기
        System.out.println( "list.indexOf( \"c\" ) = " + list.indexOf( "c" ) );
        System.out.println( "list.set(2,\"z\") = " + list.set( 2, "z" ) );

        System.out.println( "===범위 초과===" );
        list.add( "d" );
        list.add( "d" );
        list.add( "d" );
        list.add( "d" );
        list.add( "d" );
        //capacity의 한계를 넘으면 예외발생
        System.out.println( list );
    }
}
