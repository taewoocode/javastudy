package collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add( "a" );
        stringList.add( "b" );
        stringList.add( "c" );
        String string = stringList.get( 0 ); //꺼낼 때 StringType으로 이미 결정이 되었기 때문에 타입은 String으로 반환받는다.
        System.out.println( "string" + string );

        MyArrayListV4<Integer> intList = new MyArrayListV4<>();
        intList.add( 1 );
        intList.add( 2 );
        intList.add( 3 );
        Integer integer = intList.get( 1 );
        System.out.println( "integer = " + integer );


    }
}
