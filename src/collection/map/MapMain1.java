package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //학생성적추가 -> key-value 형식
        studentMap.put( "StudentA", 90 );
        studentMap.put( "StudentB", 80 );
        studentMap.put( "StudentC", 70 );
        studentMap.put( "StudentD", 60 );
        studentMap.put( "StudentE", 50 );
        System.out.println( studentMap );

        //특정 학생의 조회
        Integer result = studentMap.get( "StudentD" );
        System.out.println( "result = " + result );
        Set<String> strings = studentMap.keySet();
        System.out.println( "strings = " + strings );

        System.out.println( "keyset활용" );
        Set<String> keySet = studentMap.keySet();
        for (String key : keySet) {
            Integer value = studentMap.get( key );
            System.out.println( "key=" + key + ", value=" + value );
        }

        System.out.println( "values활용" );
        Collection<Integer> values = studentMap.values();
        for (Integer value : values) {
            System.out.println( "value = " + value );
        }


    }
}
