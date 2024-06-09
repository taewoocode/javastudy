package generic.test.ex3;

import generic.animal.Animal;

public class AnimalHospitalV1 {

    //다형성을 통한 중복제거
    private Animal animal;

    public void set(Animal animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println( "동물이름 : " + animal.getName() );
        System.out.println( "동물크기 : " + animal.getSize() );
        animal.sound();
    }

    public Animal bigger(Animal target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
