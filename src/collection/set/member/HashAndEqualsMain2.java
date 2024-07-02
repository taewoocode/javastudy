package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2();
        MemberOnlyHash m1 = new MemberOnlyHash( "A" );
        MemberOnlyHash m2 = new MemberOnlyHash( "A" );

        System.out.println( "m1.hashCode() = " + m1.hashCode() );
        System.out.println( "m2.hashCode() = " + m2.hashCode() );
        System.out.println( "m1.equals( m2 ) = " + m1.equals( m2 ) );

        MemberOnlyHash searchValue = new MemberOnlyHash( "A" );
        System.out.println( "System.identityHashCode( searchValue ) = " + System.identityHashCode( searchValue ) );
        System.out.println( "searchValue.hashCode() = " + searchValue.hashCode() );
        System.out.println( "set.contains( searchValue ) = " + set.contains( searchValue ) );
        boolean contains = set.contains( searchValue );
        System.out.println( "contains = " + contains );

    }
}
