package collection.set.javaset;


import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {

        run( new HashSet<String>() );
        run( new LinkedHashSet<String>() );
        run( new TreeSet<String>() );

    }

    private static void run(Set<String> set) {
        System.out.println( "set = " + set.getClass() );

        set.add("A");
        set.add("C");
        set.add("A");
        set.add("1");
        set.add("2");
        System.out.println( "set = " + set );

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }
}
