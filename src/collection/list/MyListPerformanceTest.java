package collection.list;

public class MyListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        System.out.println( "==MyArrayList추가==" );
        addFirst( new MyArrayList<>(), size );
        addMid( new MyArrayList<>(), size ); //찾는데 O(1), 데이터 삽입 -> 데이터 밀기O(n)
        addLast( new MyArrayList<>(), size ); //찾는데 O(1) 데이터 밀기가 없으니 O(1)

        System.out.println( "==MyLinkedList추가==" );
        addFirst( new MyLinkdeList<>(), size );
        addMid( new MyLinkdeList<>(), size ); //찾는데 O(N), 데이터 삽입O(1)
        addLast( new MyLinkdeList<>(), size ); //찾는데 O(n), 데이터 추가O(1)

    }

    private static void addLast(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add( i );
        }
        long endTime = System.currentTimeMillis();
        System.out.println( "뒤에 추가 - 크기 : " + size + ", 계산 시간 " + (endTime - startTime) + "ms" );
    }

    private static void addMid(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add( i / 2, i );
        }
        long endTime = System.currentTimeMillis();
        System.out.println(" 평균 추가 - 크기 : " + size + ", 계산 시간 " + (endTime - startTime) + "ms" );
    }

    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add( 0, i );
        }
        long endTime = System.currentTimeMillis();
        System.out.println( "앞에 추가 - 크기 : " + size + ", 계산 시간 " + (endTime - startTime) + "ms" );
    }
}
