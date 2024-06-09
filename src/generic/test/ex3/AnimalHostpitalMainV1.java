package generic.test.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHostpitalMainV1 {

    public static void main(String[] args) {

        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog( "멍멍이1", 100 );
        Cat cat = new Cat( "야옹이1", 300 );

        //개 병원
        dogHospital.set( dog );
        dogHospital.checkup();

        //고양이 병원
        catHospital.set( cat );
        catHospital.checkup();

        //문제1 : 개 병원에 고양이를 전달 가능?
        //매개변수에서 체크가 실패한다. -> 컴파일 오류가 발생하지 않는다. set에서 받아들이는게 animal이기 때문이다.
        dogHospital.set( cat );

        //문제2 : 개 타입을 반환
        dogHospital.set( dog );
        //타입은 Animal이고 인스턴스는 멍멍이2가 반환이 된다. -> 상위타입으로 반환된다.
        /*Animal animal = dogHospital.bigger( new Dog( "멍멍이2", 200 ) );*/

        //downcasting을 해줘야 한다.
        //다형성을 통해서 코드의 재사용은 늘어났지만, 타입의 안정성이 문제가 생긴다.
        //Animal타입으로 반환하지 않기 위해서 Dog타입으로 다운캐스팅을 진행하였다.
        Animal biggerDog = (Dog) dogHospital.bigger( new Dog( "멍멍이2", 200 ) );
        System.out.println( "biggerDog = " + biggerDog );



    }
}
