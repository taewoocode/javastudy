package collection.set;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class MyHashSetV2 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;
    LinkedList<Object>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {
        initBuckets();

    }

    public MyHashSetV2(int capacity) { //입력값으로 capacity를 받게끔 설정
        this.capacity = capacity;
        initBuckets();
    }

    public boolean add(Object value) {
        int hashIndex = hashIndex( value );
        LinkedList<Object> bucket = buckets[hashIndex];
        if (bucket.contains( value )) {
            return false;
        }
        bucket.add( value );
        size++;
        return true;
    }

    public boolean contains(Object searchValue) {
        int hashIndex = hashIndex( searchValue );
        LinkedList<Object> bucket = buckets[hashIndex];
        return bucket.contains( searchValue );
    }

    public boolean remove(Object value) { //value값 지우기
        int hashIndex = hashIndex( value );
        LinkedList<Object> bucket = buckets[hashIndex];
        boolean result = bucket.remove(( value ) );
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    private int hashIndex(Object value) {
        //-1,-10 - > 1, 10으로 변경
        //해시코드를 찾고 -> 나머지 연산을 수행 -> 절대값으로 변경
        return Math.abs( value.hashCode() ) % capacity;
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
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString( buckets ) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
