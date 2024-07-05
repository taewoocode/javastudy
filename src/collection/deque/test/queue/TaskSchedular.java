package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskSchedular {

    private Queue<Task> tasks = new ArrayDeque<>();

    public void addTask(Task task) {
        tasks.offer( task ); //작업등록

    }

    public void processNextTask() {
        Task task = tasks.poll();
        if (task != null) {
            task.execute();
        }
    }

    public int getRemainingTask() {
        return tasks.size();
    }
}
