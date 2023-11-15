package ch01String;

import java.util.Scanner;

/*
 알파벳 대문자로 이루어진 문자열. 같은 문자가 연속으로 반복되는 경우 반복되는 문자 바로 오른쪽에 반복 횟수 표기, 반복횟수 1은 생략
    첫 줄에 문자열 주어짐, 문자열 길이 100 안 넘음
 */
public class Main111 {
    public String sol(String s){
        String answer = "";
        s = s + " "; //빈 문자 문자열 뒤에 추가
        int cnt = 1;

        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                cnt++;
            }else{
                answer += s.charAt(i);
                if(cnt > 1){
                    answer += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main111 T = new Main111();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.sol(str));
    }
}
