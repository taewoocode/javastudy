package collection.set;

import java.util.Arrays;

public class HashStart3 {
    public static void main(String[] args) {

        Integer[] inputArray = new Integer[100];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;

        System.out.println( "inputArray = " + Arrays.toString( inputArray ) );

        int serachValue = 99;
        Integer result = inputArray[serachValue];
        //계산 한번에 인덱스를 한번에 끄집어 낸다.
        System.out.println( "result = " + result );
    }
}
