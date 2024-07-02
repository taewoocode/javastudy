package collection.set.member;

import collection.set.MyHashSetV2;
import collection.set.MyHashSetV2Main1;

public class HashAndEqualsMain1 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2();
        MemberNoHashNoEq m1 = new MemberNoHashNoEq( "A" );
        MemberNoHashNoEq m2 = new MemberNoHashNoEq( "A" );

        System.out.println( "m1.hashCode() = " + m1.hashCode() );
        System.out.println( "m2.hashCode() = " + m2.hashCode() );
        System.out.println( "m1.equals( m2 ) = " + m1.equals( m2 ) );

    }
}
