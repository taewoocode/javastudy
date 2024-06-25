package collection.list;

//클라이언트 코드
public class BatchProcessor {

    //의존성 주입
    private final MyList<Integer> list;

    //생성자 주입
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add( 0, i );
        }
        long endTime = System.currentTimeMillis();
        System.out.println( "크기: " + size + "계산 시간" + (endTime - startTime) + "ms" );
    }
}
