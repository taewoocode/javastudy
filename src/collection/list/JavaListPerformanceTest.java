package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        System.out.println( "==ArrayList추가==" );
        addFirst( new ArrayList<>(), size );
        addMid( new ArrayList<>(), size ); //찾는데 O(1), 데이터 삽입 -> 데이터 밀기O(n)

        ArrayList<Integer> arrayList = new ArrayList<>(); //조회용 데이터로 사용
        addLast( arrayList, size ); //찾는데 O(1) 데이터 밀기가 없으니 O(1)

        int loop = 10_000;
        System.out.println( "==ArrayList 조회===" );
        getIndex( arrayList, loop, 0 ); //제일 앞 조회
        getIndex( arrayList, loop, size / 2 ); // 중간
        getIndex( arrayList, loop, size - 1 ); // 뒤에

        System.out.println( "==ArrayList 검색===" );
        getSearch( arrayList, loop, 0 ); //제일 앞 조회
        getSearch( arrayList, loop, size / 2 ); // 중간
        getSearch( arrayList, loop, size - 1 ); // 뒤에

        System.out.println( "==LinkedList추가==" );
        addFirst( new LinkedList<>(), size );
        addMid( new LinkedList<>(), size ); //찾는데 O(N), 데이터 삽입O(1)

        LinkedList<Integer> linkedList = new LinkedList<>();
        addLast( linkedList, size ); //찾는데 O(n), 데이터 추가O(1)

        getIndex( linkedList, loop, 0 ); //제일 앞 조회
        getIndex( linkedList, loop, size / 2 ); // 중간
        getIndex( linkedList, loop, size - 1 ); // 뒤

        System.out.println( "==MyLinkedList 검색===" );
        getSearch( linkedList, loop, 0 ); //제일 앞 조회
        getSearch( linkedList, loop, size / 2 ); // 중간
        getSearch( linkedList, loop, size - 1 ); // 뒤에

    }

    private static void addLast(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add( i );
        }
        long endTime = System.currentTimeMillis();
        System.out.println( "뒤에 추가 - 크기 : " + size + ", 계산 시간 " + (endTime - startTime) + "ms" );
    }

    private static void addMid(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add( i / 2, i );
        }
        long endTime = System.currentTimeMillis();
        System.out.println(" 평균 추가 - 크기 : " + size + ", 계산 시간 " + (endTime - startTime) + "ms" );
    }

    private static void addFirst(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add( 0, i );
        }
        long endTime = System.currentTimeMillis();
        System.out.println( "앞에 추가 - 크기 : " + size + ", 계산 시간 " + (endTime - startTime) + "ms" );
    }

    private static void getIndex(List<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get( index );
        }
        long endTime = System.currentTimeMillis();
        System.out.println( "index: " + index + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms" );

    }
    private static void getSearch(List<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf( findValue );
        }
        long endTime = System.currentTimeMillis();
        System.out.println( "index: " + findValue + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms" );
    }
}
