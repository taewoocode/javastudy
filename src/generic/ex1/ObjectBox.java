package generic.ex1;

public class ObjectBox {

    //Object는 모두의 부모이다. 다 들어올 수 있다.

    private Object value;

    public void set(Object object) {
        this.value = object;
    }

    public Object get(){
        return value;
    }
}
