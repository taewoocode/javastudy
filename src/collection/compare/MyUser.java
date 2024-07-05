package collection.compare;

public class MyUser implements Comparable<MyUser> {


    private String id;
    private int age;

    public MyUser(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(MyUser o) {
        System.out.println( this + " vs " + o );
        return this.age < o.age ? -1 : (this.age == o.age ? 0 : 1);
        //this.age가 o.age보다 작으면 - 1, this.age가 o.age랑 같으면 0 이것도 저것도 아니면 1( 더 큰 경우를 말하는 것 )

    }
}
