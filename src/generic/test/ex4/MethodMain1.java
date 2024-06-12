package generic.test.ex4;

import generic.animal.Dog;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 1;
        Object object = GenericMethod.objMethod( i );

        //타입인자 명시적 전달
        System.out.println( "타입인자 명시적 전달" );
        Integer result = GenericMethod.<Integer>genericMethod( i );
        System.out.println( "result = " + result );
        Integer integer = GenericMethod.<Integer>numberMethod( 10 );
        Double integer2 = GenericMethod.<Double>numberMethod( 20.0 );
        System.out.println( "integer = " + integer );
    }
}
