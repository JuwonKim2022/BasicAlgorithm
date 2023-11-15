package ch01String;

import java.util.Scanner;

//숫자만 반환
public class Main092 {
    public int sol(String s){
        String answer = "";

        for(char x : s.toCharArray()){
            if(Character.isDigit(x)){ //숫자냐?
                answer += x;
            }
        }
        return Integer.parseInt(answer); //스트링을 인트로로 바꿈
    }

    public static void main(String[] args) {
        Main092 T = new Main092();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.sol(str));
    }
}
