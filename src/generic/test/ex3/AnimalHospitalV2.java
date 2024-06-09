package generic.test.ex3;

public class AnimalHospitalV2<T> {

    //다형성을 통한 중복제거
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }


    //T의 타입을 정의하는 시점에는 알 수가 없다. Object기능만 사용한다. -> Object는 모든 객체의 부모
    public void checkup() {

        animal.toString();
        animal.equals( null );

        /*System.out.println( "동물이름 : " + animal.getName() );
        System.out.println( "동물크기 : " + animal.getSize() );
        animal.sound()*/;

    }

    public T bigger(T target) {
/*
        return animal.getSize() > target.getSize() ? animal : target;
*/
        return null;
    }
}
