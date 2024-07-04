package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner( System.in );

        System.out.println( "==단어 입력 단계==" );
        while (true) {
            System.out.println( "영어 단어를 입력하세요(종료는 'q'): " );
            String englishWord = scanner.nextLine();

            if (englishWord.equals( "q" )) {
                break; //while문 탈출
            }
            System.out.println( "한글 뜻을 입력하세요." );
            String koreanMeaning = scanner.nextLine();

            dictionary.put( englishWord, koreanMeaning );
        }

        System.out.println( "==단어 검색 단계==" );
        while (true) {
            System.out.println( "찾을 영어 단어를 입력하세요. 종료는 'q" );
            String serachWord = scanner.nextLine();

            if (serachWord.equals( "q" )) {
                break;
            }
            if (dictionary.containsKey( serachWord )) {
                String koreanMeaning = dictionary.get( serachWord ); //value 반환
                System.out.println( serachWord + "의 뜻" + koreanMeaning );
            } else {
                System.out.println( serachWord + "은(는) 사전에 없는 단어입니다." );
            }
        }
    }
}
