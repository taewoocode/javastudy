package collection.map;

import java.util.HashMap;

public class MapMain3 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put( "studentA", 50 );
        System.out.println( studentMap );

        //학생이 없는 경우에만 데이터를 추가
        if (!studentMap.containsKey( "studentA" )) {
            studentMap.put( "studentA", 100 );
        }
        System.out.println(studentMap);


    }
}
