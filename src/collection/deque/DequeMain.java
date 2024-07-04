package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        //Deque<Integer> deque = new LinkedList<>()

        //데이터 추가
        deque.offerFirst( 1 );
        System.out.println( deque ); //1

        deque.offerFirst( 2 );
        System.out.println( deque ); //1,2

        deque.offerLast( 3 );
        System.out.println( deque ); //2,1,3

        deque.offerLast( 4 );
        System.out.println( deque );

        //다음 꺼낼 데이터 조회
        System.out.println( "deque.peekFirst() = " + deque.peekFirst() );
        System.out.println( "deque.peekLast() = " + deque.peekLast() );

        //데이터 꺼내기
        System.out.println( "deque.pollFirst() = " + deque.pollFirst() );
        System.out.println( "deque.pollFirst() = " + deque.pollFirst() );
        System.out.println( "deque.pollLast() = " + deque.pollLast() );
        System.out.println( "deque.pollLast() = " + deque.pollLast() );

        System.out.println(deque);
    }
}
