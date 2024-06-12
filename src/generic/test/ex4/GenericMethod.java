package generic.test.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj) { //Object를 받는다. 매개변수로
        System.out.println( "Object print:" + obj );
        return obj;
    }
    public static <T> T genericMethod(T obj) { //Object를 받는다. 매개변수로
        System.out.println( "generic print:" + obj );
        return obj;
    }
    public static <T extends Number> T numberMethod(T obj) { //type매개변수 상한 method
        System.out.println( "bound print:" + obj );
        return obj;
    }
}
