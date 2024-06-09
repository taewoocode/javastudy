package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); //생성 시점의 T의 타입이 결정이 된다.
        integerBox.set( 10 );
        //integerBox.set() //Integer type만 허용
        Integer integer = integerBox.get(); //casting할 필요가 없어짐.
        System.out.println( "integer = " + integer );

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set( "hello" );
        String string = stringBox.get();
        System.out.println( "string = " + string );


        //원하는 모든 타입 사용가능
        GenericBox<Double> doubleGenericBox = new GenericBox<>();
        doubleGenericBox.set( 10.5 );
        Double v = doubleGenericBox.get();
        System.out.println( "v = " + v );

        //타입추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();


    }
}
