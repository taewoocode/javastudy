package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        //GenericBox<Object> integerBox = new GenericBox<>(); //권장
        integerBox.set( 10 );
        Object object = (Integer) integerBox.get(); //String으로 타입을 결정한다면 타입안전성을 보장할 수 없다.
        System.out.println( "object = " + object );

        /*
        row type은 권장하지 않는 방식이다.
         */
    }
}
