package collection.set.test;

import java.util.HashSet;

public class RectangleTest {
    public static void main(String[] args) {
        HashSet<Rectangle> rectangleSet = new HashSet<>();
        rectangleSet.add( new Rectangle( 10, 10 ) );
        rectangleSet.add( new Rectangle( 20, 20 ) );
        rectangleSet.add( new Rectangle( 20, 20 ) ); //중복

        for (Rectangle s : rectangleSet) {
            System.out.println( "retangle = " + s );
        }

    }
}
