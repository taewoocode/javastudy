package collection.list;

public class MyListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        System.out.println( "==MyArrayList추가==" );
        addFirst( new MyArrayList<>(), size );
        System.out.println( "==MyLinkedList추가==" );
        addFirst( new MyLinkdeList<>(), size );

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
