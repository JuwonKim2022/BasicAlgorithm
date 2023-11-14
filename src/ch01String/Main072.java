package ch01String;

import java.util.Scanner;

//회문문자열(앞으로 읽으나 뒤로 읽으나 같은것) 판별, 대소문자 구분 안
public class Main072 {

    public String sol(String str){
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString(); //뒤집어진거

        if(str.equalsIgnoreCase(tmp)){
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        Main072 T = new Main072();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.sol(str));
    }

}
