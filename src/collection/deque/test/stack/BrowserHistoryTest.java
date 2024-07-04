package collection.deque.test.stack;

public class BrowserHistoryTest {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();
        browser.visitPage( "youtube.com" );
        browser.visitPage( "google.com" );
        browser.visitPage( "facebook.com" );

        browser.goBack();

    }
}
