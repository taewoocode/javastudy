package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {

    public static void main(String[] args) {
        Animal animal = new Animal( "동물", 0 );
        Dog dog = new Dog( "멍멍이", 100 );
        Cat cat = new Cat( "냐옹이", 50 );

        Box<Animal> animalBox = new Box<>();
        animalBox.set( animal );
        animalBox.set( cat );
        animalBox.set( dog );

        //마지막으로 set한게 dog이기 때문에 dog가 출력
        Animal findAnimal = animalBox.get();
        System.out.println( "findAnimal = " + findAnimal );
    }
}
