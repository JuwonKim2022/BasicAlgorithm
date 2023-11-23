package ch04HashMapTreeSet;

import java.util.HashMap;
import java.util.Scanner;

/*
<아나그램 - 해쉬>
아나그램 = 두 문자열이 알파벳의 나열 순서는 다르지만 그 구성이 일치 , 대소문자 구분
- 첫 번째 줄에 첫 단어 입력
- 두 번째 줄에 두 번째 단어 입력
- 단어 길이 100이하
*/
public class Main021 {
    public String sol(String s1, String s2){
        String answer = "YES";
        HashMap<Character,Integer> map = new HashMap<>();
        for (char x : s1.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for (char x : s2.toCharArray()){
            if (!map.containsKey(x) || map.get(x)==0) return "NO";
            map.put(x, map.get(x)-1);
        }
        return answer;
    }
    public static void main(String[] args) {
        Main021 T = new Main021();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(T.sol(a, b));
    }
}
