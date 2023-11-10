package ch002;

import java.util.Scanner;

// 소문자에서 32 빼면 대문자
public class Main2 {
    public String sol(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(x >= 97 && x <= 122){
                answer += (char)(x-32);
            }else {
                answer += (char)(x+32);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main2 M = new Main2();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(M.sol(str));
    }
}
