package collection.set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class HashStart5 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //LinkedList를 넣을 수 있는 배열이다.
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
            
        }
        System.out.println( "buckets = " + Arrays.toString( buckets ) );
        add(buckets , 1 );
        add(buckets , 2 );
        add(buckets , 5 );
        add(buckets , 8 );
        add(buckets , 14 );
        add( buckets, 99 );
        add( buckets, 9 ); //중복

        //검색
        int serachValue = 9;
        boolean contains = contains( buckets, serachValue );
        System.out.println( "bucket.contains(" + serachValue + ") = " + contains );

    }

    private static void add(LinkedList<Integer>[] buckets, int value) { //bucket에 value를 넣을 것
        int hashIndex = hashIndex( value );
        LinkedList<Integer> bucket = buckets[hashIndex]; //O(1)
        if (!bucket.contains( value )) { //중복체크
            bucket.add( value );
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex( searchValue );
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains( searchValue ); //c + n
    }

    //검색
    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
