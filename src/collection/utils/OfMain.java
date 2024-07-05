package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        //편리한 불변 컬렉션
        List<Integer> list = List.of( 1, 2, 3 );
        Set<Integer> set = Set.of( 1, 2, 3 );
        Map<Integer, String> map = Map.of( 1, "one", 2, "two" );

        System.out.println( "list = " + list );
        System.out.println( "set = " + set );
        System.out.println( "map = " + map );

        //불변객체 -> 값을 변경할 수 없는 리스트가 넘어간다.
        System.out.println( "list class" + list.getClass() );
    }
}
