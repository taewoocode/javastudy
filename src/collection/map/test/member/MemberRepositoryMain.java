package collection.map.test.member;

public class MemberRepositoryMain {

    public static void main(String[] args) {

        Member member1 = new Member( "id1", "회원1" );
        Member member2 = new Member( "id2", "회원2" );
        Member member3 = new Member( "id3", "회원3" );


        //회원 저장
        MemberRespository respository = new MemberRespository();
        respository.save( member1 );
        respository.save( member2 );
        respository.save( member3 );

        //회원 조회
        Member findMember1 = respository.findById( "id1" );
        System.out.println( "findMember1 = " + findMember1 );

        Member findmember3 = respository.findByName( "회원3" );
        System.out.println( "findmember3 = " + findmember3 );

        //회원 삭제
        respository.remove( "id1" );
        Member removeMember1 = respository.findById( "id1" );
        System.out.println( "removeMember1 = " + removeMember1 );


    }
}
