package collection.list;


public class BatchProcessorMain {
    public static void main(String[] args) {
        MyList<Integer> list = new MyLinkdeList<>();

        BatchProcessor processor = new BatchProcessor( list );
        processor.logic( 50_000 );
    }
}
