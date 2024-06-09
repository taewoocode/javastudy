package generic.test.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHostpitalMainV3 {

    public static void main(String[] args) {

        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog( "멍멍이1", 100 );
        Cat cat = new Cat( "야옹이1", 300 );

        //개 병원
        dogHospital.set( dog );
        dogHospital.checkup();

        //고양이 병원
        catHospital.set( cat );
        catHospital.checkup();

        //문제1 : 개 병원에 고양이를 전달 가능?
        //다른타입 입력 -> 컴파일 오류가 발생한다.
        //dogHospital.set( cat );

        //문제2 : 개 타입을 반환
        //타입은 Animal이고 인스턴스는 멍멍이2가 반환이 된다. -> 상위타입으로 반환된다.
        /*Animal animal = dogHospital.bigger( new Dog( "멍멍이2", 200 ) );*/
        //downcasting을 해줘야 한다.
        //다형성을 통해서 코드의 재사용은 늘어났지만, 타입의 안정성이 문제가 생긴다.
        //Animal타입으로 반환하지 않기 위해서 Dog타입으로 다운캐스팅을 진행하였다.
        //casting할 필요가 없다.
        Animal biggerDog = dogHospital.bigger( new Dog( "멍멍이2", 200 ) );
        System.out.println( "biggerDog = " + biggerDog );
    }
}
