package generic.test.ex4;

import generic.animal.Cat;
import generic.animal.Dog;


public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog( "멍멍이", 100 );
        Cat cat = new Cat( "냐용이", 100 );

        //타입추론은 생략되어 있음 -> 타입매개변수 추론
        AnimalMethod.checkup( dog );
        AnimalMethod.checkup( cat );

        Dog targerDog = new Dog( "큰 멍멍이", 200 );
        Dog bigger = AnimalMethod.bigger( targerDog, dog );
        System.out.println( "bigger = " + bigger );

    }
}
