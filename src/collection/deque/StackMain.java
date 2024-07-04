package collection.deque;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push( 1 );
        stack.push( 2 );
        stack.push( 3 );
        System.out.println( stack );

        //조회
        System.out.println( "stack.peek() = " + stack.peek() );

        //뽑기
        System.out.println( "stack.pop() = " + stack.pop() ); //3
        System.out.println( "stack.pop() = " + stack.pop() ); //2
        System.out.println( "stack.pop() = " + stack.pop() ); //1
        System.out.println(stack); //[]

        
    }
}
