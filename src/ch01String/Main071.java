package ch01String;

import java.util.Scanner;

//회문문자열(앞으로 읽으나 뒤로 읽으나 같은것) 판별, 대소문자 구분 안
public class Main071 {

    public String sol(String str){
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();

        for(int i = 0; i < len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)){
                return "NO";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main071 T = new Main071();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.sol(str));
    }

}
