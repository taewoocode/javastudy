package collection.array;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println( Arrays.toString( arr ) );

        //배열의 첫번째 위치에 추가
        //기존 배열을 한 칸씩 뒤로 밀고 첫번 째 위치에 추가
        int newValue = 3;

        addFirst(arr, newValue); //배열에다가 new Value를 넣는 메서드
        System.out.println( Arrays.toString( arr ) );

        //index 위치에 추가
        //기본 배열의 데이터를 한 칸씩 밀고 배열의 index 위치에 추가
        int index = 2;
        int value = 4;
        addAtIndex(arr, index, value );
        System.out.println( Arrays.toString( arr ) );

        addLastIndex( arr, 5 );
        System.out.println( Arrays.toString(arr) );

    }

    private static void addLastIndex(int[] arr, int newValue) {
        arr[arr.length - 1] = newValue;
    }

    private static void addAtIndex(int[] arr, int index, int value) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value; //인덱스에 위치에 value 삽입
    }

    private static void addFirst(int[] arr, int newValue) {
        for (int i = arr.length - 1; i > 0; i--) { //배열의 크기가 5 거기서 -1을 뺴줘야 index가 되기 때문이다.
            arr[i] = arr[i - 1]; //왼쪽에 있는 값 오른쪽에 대입
        }
        arr[0] = newValue;
    }
}
