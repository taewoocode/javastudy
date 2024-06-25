package collection.link;

public class MyLinkedListV3Main {

    public static void main(String[] args) {
        MyLinkdeListV3<String> stringList = new MyLinkdeListV3<>();
        stringList.add( "a" );
        stringList.add( "b" );

        //반환 타입은 string으로 결정된다. -> 타입안정성을 보장한다.
        String string = stringList.get( 0 );

        //타입안정성을 위하여 들어갈 수 없다.
        //stringList.add( 1 );

        //Integer로 만들기
        MyLinkdeListV3<Integer> integerList = new MyLinkdeListV3<>();
        integerList.add( 1 );
        integerList.add( 2 );
        integerList.add( 3 );

        //문자열을 넣을 수 없다. -> 타입안정성을 위하여
        //integerList.add( "asd" );

        //반환타입은 Integer가 된다. 타입안정성 보장
        Integer integer = integerList.get(1);
    }
}
