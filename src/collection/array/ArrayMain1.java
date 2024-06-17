package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5]; //메모리 공간에 5개의 인트형 배열이 만들어진다.
        //index 입력 O(1) 몇번의 계산만에 찾냐를 나타낸다.
        System.out.println( "==index입력: O(1)==" );
        //배열의 위치를 바로 찾는다
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        //System.out.println( arr ); //참조값이 나온다
        System.out.println( Arrays.toString( arr ) );
        arr[2] = 10;
        System.out.println( "==index변경: O(1)==" );
        System.out.println( Arrays.toString( arr ) );

        System.out.println( "==index조회: O(1)==" );
        System.out.println( "arr[2]" + arr[2] );

        System.out.println( "==index검색: O(1)==" );
        System.out.println( Arrays.toString( arr ) );
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println( "arr[" + i + "]: " + arr[i] );
            if (arr[i] == value) {
                System.out.println(value + "찾음");
                break;
            }
        }
    }
}
