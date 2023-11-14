package ch01String;

import java.util.Scanner;

// 팰린드롬)앞에서 읽으나 뒤에서 읽으나 같은 문자열), 대소문자 구분 안함, 알파벳 이외의 것은 무시
public class Main081 {
    public String sol(String s){
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", ""); //정규화 가능, 정규화 이용

        String tmp = new StringBuilder(s).reverse().toString();

        if(s.equals(tmp)){
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        Main081 T = new Main081();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.sol(str));
    }
}
