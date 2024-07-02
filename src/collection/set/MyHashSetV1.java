package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;
    LinkedList<Integer>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        initBuckets();

    }

    public MyHashSetV1(int capacity) { //입력값으로 capacity를 받게끔 설정
        this.capacity = capacity;
        initBuckets();
    }

    public boolean add(int value) {
        int hashIndex = hashIndex( value );
        LinkedList<Integer> bucket = buckets[hashIndex];
        if (bucket.contains( value )) {
            return false;
        }
        bucket.add( value );
        size++;
        return true;
    }

    public boolean contains(int searchValue) {
        int hashIndex = hashIndex( searchValue );
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains( searchValue );
    }

    public boolean remove(int value) { //value값 지우기
        int hashIndex = hashIndex( value );
        LinkedList<Integer> bucket = buckets[hashIndex];
        bucket.remove( Integer.valueOf( value ) ); //List의 있는 값을 지워야 하기 때문에 Wrapper타입으로 넘겨야 한다.
        boolean result = bucket.remove( Integer.valueOf( value ) );
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    private int hashIndex(int value) {
        return value % capacity;
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString( buckets ) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
