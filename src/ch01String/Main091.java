package ch01String;

import java.util.Scanner;

//숫자만 반환
public class Main091 {
    public  int sol(String s){
        int answer = 0;

        for (char x : s.toCharArray()){
            if(x >= 48 && x <= 57){   //문자 0~9
                answer += answer*10 + (x-48);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main091 T = new Main091();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.sol(str));
    }
}
