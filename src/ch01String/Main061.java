package ch01String;

import java.util.Scanner;

//중복 문자 제거
public class Main061 {

    public String sol(String str){
        String answer = "";
        for(int i = 0; i <str.length(); i++){
            //System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i)) == i){
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main061 T = new Main061();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.sol(str));
    }
}
