package generic.ex1;

public class IntegerBox {

    private Integer value;

    //Integer value 보관
    public void set(Integer value){
        this.value = value;
    }

    //Integer value 꺼내기
    public Integer get() {
        return value;
    }
}
