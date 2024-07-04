package collection.map;

import java.util.*;

public class JavaMapMain {
    public static void main(String[] args) {
        run( new HashMap<>() );
        run( new LinkedHashMap<>() );
        run( new TreeMap<>() );

    }

    private static void run(Map<String, Integer> map) {
        System.out.println( "map = " + map );
        map.put( "C", 10 );
        map.put( "A", 20 );
        map.put( "B", 30 );
        map.put( "D", 40 );
        map.put( "E", 50 );

        Set<String> ketSet = map.keySet();
        Iterator<String> iterator = ketSet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + "=" + map.get( key ) + " ");
        }
        System.out.println();
    }
}
