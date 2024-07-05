package collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {

    private int currentIndex = -1;
    private int[] targetArr;

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        //5, 0 ~ 4 그래서 5 - 1
        return currentIndex < targetArr.length - 1; //인덱스 마지막
    }

    @Override
    public Integer next() {
        //currentIndex++;
        return targetArr[++currentIndex]; //전위증감
    }
}
