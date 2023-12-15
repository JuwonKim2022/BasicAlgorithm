package ch04HashMapTreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
<모든 아나그램 찾기 - 해쉬, 투포인터, 슬라이딩 윈도우>
S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램 작성, 대소문자 구분, 부분문자열은 연속된 문자열
- 첫 번째 줄 : S문자열 / 길이 10,000 이하
- 두 번째 줄 : T문자열 / S문자열보다 작거나 같음
===> S단어에 T문자열과 아나그램이 되는 부분문자열의 개수 출력
*/
public class Main041 {
    public int sol(String a, String b){
        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        for (char x : b.toCharArray()){
            bm.put(x, bm.getOrDefault(x, 0)+1);
        }
        int L = b.length()-1;
        for (int i=0; i<L; i++){
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i),0)+1);
        }
        //투포인트 알고리즘
        int lt = 0;
        for (int rt=L; rt<a.length(); rt++){
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt    ),0)+1);
            if (am.equals(bm)) answer++;
            am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
            if (am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
            lt++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main041 T = new Main041();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(T.sol(a,b));
    }
}
