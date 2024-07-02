package collection.set.member;

import collection.set.MySet;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E> {


    static final int DEFAULT_INITIAL_CAPACITY = 16;
    LinkedList<E>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV3() {
        initBuckets();

    }

    public MyHashSetV3(int capacity) { //입력값으로 capacity를 받게끔 설정
        this.capacity = capacity;
        initBuckets();
    }

    public boolean add(E value) {
        int hashIndex = hashIndex( value );
        LinkedList<E> bucket = buckets[hashIndex];
        if (bucket.contains( value )) {
            return false;
        }
        bucket.add( value );
        size++;
        return true;
    }

    public boolean contains(E searchValue) {
        int hashIndex = hashIndex( searchValue );
        LinkedList<E> bucket = buckets[hashIndex];
        return bucket.contains( searchValue );
    }

    public boolean remove(E value) { //value값 지우기
        int hashIndex = hashIndex( value );
        LinkedList<E> bucket = buckets[hashIndex];
        boolean result = bucket.remove( (value) );
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    private int hashIndex(E value) {
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
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString( buckets ) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
