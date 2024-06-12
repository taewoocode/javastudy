package generic.test.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain1 {
    public static void main(String[] args) {
        Box<Object> object = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set( new Dog( "멍멍이", 100 ) );
        catBox.set( new Cat( "냐옹이", 30 ) );


        //type추론에 의해서 <Dog>가 들어간다. -> T가 다 Dog가 된다.
        WildcardEx.printGenericV1( dogBox );
        WildcardEx.printGenericV2( dogBox );
        WildcardEx.printAndReturnGeneric( dogBox );

        WildcardEx.wildCardV1( dogBox );
        WildcardEx.printGenericV2( catBox );

        Dog dog = WildcardEx.printAndReturnGeneric( dogBox );
        Animal animal = WildcardEx.printAndReturnWildcard( dogBox );

    }
}
