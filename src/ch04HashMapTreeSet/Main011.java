package ch04HashMapTreeSet;

import java.util.HashMap;
import java.util.Scanner;

/*
<학급 회장 - 해쉬>
학급 회장 후보 기호 a,b,c,d,e 등록
발표 후 어떤 기호 후보가 학급 회장 되는지 출력하는 프로그램 작성
반드시 한명
- 첫 번째 줄에 반 학생수 5<=N<=50
- 두 번째 줄에 N개의 투표용지에 쓰여진 각 후보의 기호가 선생님 발표 순서대로 문자열 나열
 ===> 해쉬맵 : 키(char)-벨류(int)
 */
public class Main011 {
    public char sol(int n, String s){
        char answer = ' ';
        HashMap<Character,Integer> map = new HashMap<>();
        for (char x : s.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1); //해쉬 카운팅
        }
        /*해쉬맵 출력해보기
        for (char key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
        특정 키 확인
        System.out.println(map.containsKey('A'));
        사이즈 확인 = 키의 갯수
        System.out.println(map.size());
        특정 키 삭제
        System.out.println(map.remove('A'));
         */
        //실제 메커니즘

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()){
            if (map.get(key)>max){
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main011 T = new Main011();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.sol(n, str));
    }
}
