package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set( 10 );
        Object object = integerBox.get();

        //object를 integer로 다운캐스팅 한다.
        Integer integer = (Integer) object; //Object -> Integer로 캐스팅 (down)
        System.out.println( "integer = " + integer );

        ObjectBox stringBox = new ObjectBox();
        stringBox.set( "hello" );
        String str = (String) stringBox.get(); //Object -> String으로 캐스팅 (down)

        //잘못된 타입의 인수 전달시 ?
        //ClassCastException발생
        integerBox.set( "문자 100" );
        Object result = integerBox.get();
        System.out.println( "result = " + result );




    }
}
