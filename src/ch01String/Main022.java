package ch01String;

import java.util.Scanner;

public class Main022 {

    public String sol(String str){
        String answer = "";

        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main022 M = new Main022();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(M.sol(str));
    }

}
