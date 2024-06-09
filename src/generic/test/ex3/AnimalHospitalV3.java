package generic.test.ex3;

import generic.animal.Animal;

//T에 들어올 수 있는 것은 Animal 혹은 그 자식들만 들어올 수 있다.-> T는 animal의 자식들을 쓸 수 있다.
public class AnimalHospitalV3<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println( "동물이름 : " + animal.getName() );
        System.out.println( "동물크기 : " + animal.getSize() );
        animal.sound();
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
