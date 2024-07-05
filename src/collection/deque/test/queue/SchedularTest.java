package collection.deque.test.queue;

public class SchedularTest {
    public static void main(String[] args) {

        TaskSchedular schedular = new TaskSchedular();
        schedular.addTask( new CompressionTask() );
        schedular.addTask( new BackupTask() );
        schedular.addTask( new CleanTask() );

        System.out.println( "작업 시작" );
        run( schedular );
        System.out.println( "작업 종료" );

    }

    private static void run(TaskSchedular schedular) {
        while (schedular.getRemainingTask() > 0) {
            schedular.processNextTask();
        }
    }
}
