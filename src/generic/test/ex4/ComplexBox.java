package generic.test.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public <T> T printAndReturn(T t){
        System.out.println( "animal.className = " + animal.getClass().getName() );
        System.out.println( "t.className = " + t.getClass().getName() );
        return t;
    }

    //제네릭 T가 2개가 있다. 클래스T, 메서드T 2개가 있다.
    /*
    제네릭 타입보다 제네릭 메서드가 높은 우선순위를 가진다.
    상식적으로 생각해보면 클래스레벨보다 메서드레벨이 더 우선순위가 높다.
    프로그래밍에서는 가깝고, 구체적인 것이 우선순위가 높다.
     */
}
