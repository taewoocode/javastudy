package collection.map.test.member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberRespository {

    private Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member) {
        memberMap.put( member.getId(), member );
    }

    public void remove(String id) {
        memberMap.remove( id );
    }

    public Member findById(String id) {
        return memberMap.get( id );
    }

    public Member findByName(String name) {
        for (Member member : memberMap.values()) { //value로 member를 뒤져서
            if (member.getName().equals( name )) {
                return member;
            }
        }
        //못찾으면 null
        return null;
    }
}
