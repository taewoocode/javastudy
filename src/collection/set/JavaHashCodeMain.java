package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        //Object의 기본 해시코드는 객체의 참조 기반으로 생성한다.
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println( "obj1.hashCode() = " + obj1.hashCode() ); //객체의 참조값
        System.out.println( "obj2.hashCode() = " + obj2.hashCode() ); //객체의 참조값
        System.out.println( "obj1 = " + obj1 ); //16진수값 출력 2d6e8792
        System.out.println( "obj2 = " + obj2 ); //796533847 -> 2f7a2457

        //각 클래스마다 hashCode를 다 재정의 해두었다.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println( "i.hashCode() = " + i.hashCode() );
        System.out.println( "strA.hashCode() = " + strA.hashCode() );
        System.out.println( "strAB.hashCode() = " + strAB.hashCode() );

        //hashCode -값이 들어올 수 있다.
        System.out.println( "Integer.valueOf( -1 ).hashCode() = " + Integer.valueOf( -1 ).hashCode() );
        System.out.println( "Integer.valueOf( -2 ).hashCode() = " + Integer.valueOf( -2 ).hashCode() );


        //둘은 같을까?
        Member member1 = new Member( "idA" );
        Member member2 = new Member( "idA" );
        System.out.println( "(member1 == member2) = " + (member1 == member2) );
        System.out.println( "member1 equals member2 = " + member1.equals( member2 ) );
        System.out.println("member1.hashCode()= " + member1.hashCode());
        System.out.println("member2.hashCode()= " + member2.hashCode());


    }
}
