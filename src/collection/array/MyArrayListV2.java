package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData; //모든 타입을 다 담을 수 있는 ObjectType
    private int size = 0;

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++; // 1 -> 2 -> 3 ..... 배열에 순서대로 값을 넣는다.
    }

    //코드추가 기존배열보다 커지면 큰 배열로 교체
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = elementData.length * 2;

        //배열을 새로 만들고 기존 배열을 새로운 배열에 복사한다.
        /*Object[] newArr = new Object[newCapacity];
        for (int i = 0; i < elementData.length; i++) {
            newArr[i] = elementData[i];
        }*/

        //기존의 배열을 새로운 배열로 교체
        elementData = Arrays.copyOf( elementData, newCapacity );
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get( index );
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals( elementData[i] )) {
                return i ;
            }
        }
        return - 1;
    }

    public String toString() {
        //[1, 2, 3, null, null] size = 3;
        //[1,2,3] size = 3;
        return Arrays.toString( Arrays.copyOf( elementData, size ) ) + "size = " + size +
                ", capacaity= " + elementData.length;
    }


}
