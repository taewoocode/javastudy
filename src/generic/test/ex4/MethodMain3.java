package generic.test.ex4;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {

        Dog dog = new Dog( "멍멍이", 100 );
        Cat cat = new Cat( "냐옹이", 50 );

        ComplexBox<Dog> animalComplexBox = new ComplexBox<>();
        animalComplexBox.set( dog );

        Cat cat1 = animalComplexBox.printAndReturn( cat );
        System.out.println( "cat1 = " + cat1 );


    }
}
