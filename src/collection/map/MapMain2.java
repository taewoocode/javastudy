package collection.map;

import java.util.HashMap;

public class MapMain2 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put( "studentA", 90 );
        System.out.println( studentMap );

        studentMap.put( "studentA", 100 ); //같은 키에 저장식 기존 값 교체
        System.out.println( studentMap );

        boolean containsKey = studentMap.containsKey( "studentA" );
        System.out.println( containsKey );

        //삭제
        studentMap.remove( "studentA" );
        System.out.println(studentMap);


    }
}
