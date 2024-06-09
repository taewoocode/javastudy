package generic.test.ex3;

import generic.animal.Cat;

public class CatHospital {

    private Cat animal;

    public void set(Cat animal) {
        this.animal = animal;

    }

    public void checkup() {
        System.out.println( "동물이름 : " + animal.getName() );
        System.out.println( "동물크기 : " + animal.getSize() );
        animal.sound();
    }


    //animal과 인자로 넘어온 target의 크기를 비교하여 더 큰 값을 반환해준다.
    public Cat bigger(Cat target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
