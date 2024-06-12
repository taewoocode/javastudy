package generic.test.ex5;

import generic.animal.Animal;

public class WildcardEx {

    static <T> void printGenericV1(Box<T> box) {
        System.out.println( "T = " + box.get() );
    }

    //wildCardMethod
    static <T extends Animal> void printGenericV2(Box<T> box) { //T는 Animal만 받는다. 상한을 정헀기 때문이다.
        T t = box.get();
        System.out.println( "t = " + t.getName() );

    }
    static void printWildCardV2(Box<? extends Animal> box) { //T는 Animal만 받는다. 상한을 정헀기 때문이다.
        Animal animal = box.get();
        System.out.println( "t = " + animal.getName() );

    }


    //?는 아무거나 다 들어올 수 있음을 의미한다. box<cat>, box<dog>, box<Object>도 들어올 수 있다.
    static void wildCardV1(Box<?> box) {
        System.out.println( "? = " + box.get() );

    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println( "이름 = " + t.getName() );
        return t;
    }
    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println( "이름 = " +  animal.getName() );
        return animal;
    }
}
