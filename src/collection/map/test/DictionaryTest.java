package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        Scanner scanner=new Scanner(System.in);

        System.out.println("==단어 입력 단계==");
        while(true){
            System.out.println("영어단어를 입력하세요. 종료는 q");
            String englishWord=scanner.nextLine();
            if(englishWord.equals("q")){
                break;
            }
            System.out.println("한글 뜻을 입력하세요");
            String KoreanMeaning=scanner.nextLine();
            map.put(englishWord,KoreanMeaning);

        }
        System.out.println("==단어 검색 단계==");
        while(true){
            System.out.println("찾고 싶은 영단어를 입력하시오. 종료는 q");
            String searchWord=scanner.nextLine();
            if(searchWord.equals("q")){
                break;
            }
            if(map.containsKey(searchWord)){
                System.out.println("찾고자 하는 영단어의 한글 의미는 "+map.get(searchWord)+" 입니다.");
            }
        }

    }
}
