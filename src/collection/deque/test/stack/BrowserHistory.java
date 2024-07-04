package collection.deque.test.stack;

import generic.animal.Cat;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    // 코드 작성
    private Deque<String> history = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String url) {
        if (currentPage != null) { //현재페이지가 null이 아니면
            history.push( currentPage );
        }
        //if문과 상관없이 무조건 실행되는 코드이다.
        currentPage = url;
        System.out.println( "방문:" + url );
    }

    public String goBack() {
        if (!history.isEmpty()) {
            String currentPage = history.pop();
            System.out.println( "뒤로 가기" + currentPage );
            return currentPage;
        }
        return null;
    }
}
