package generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set( 10 ); //autoboxing
        Integer integer = integerBox.get();
        System.out.println( "integer = " + integer );

        StringBox stringBox = new StringBox();
        stringBox.set( "hello" );
        String str = stringBox.get();
        System.out.println( "str = " + str );
    }


}
