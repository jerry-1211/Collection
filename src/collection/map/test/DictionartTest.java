package collection.map.test;

import java.util.HashMap;
import java.util.Scanner;

public class DictionartTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==단어 입력 단계==");

        String voca = "";
        String meaning = "";

        HashMap<String,String> dict = new HashMap<>();
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            voca = scanner.nextLine();

            if(voca.equals("q")){
                break;
            }

            System.out.print("한글의 뜻을 입력하세요 : ");
            meaning = scanner.nextLine();

            dict.put(voca,meaning);
        }

        System.out.println("==단어 검색 단계==");

        String search = "";
        while (true){
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            search = scanner.nextLine();

            if(search.equals("q")){
                break;
            }

            if(dict.containsKey(search)){
                System.out.println(search + "의 뜻 : " + dict.get(search));
            }else{
                System.out.println(search + "는 사전에 없는 단어입니다.");
            }

        }
    }
}

