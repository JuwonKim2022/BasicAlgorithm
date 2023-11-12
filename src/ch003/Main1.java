package ch003;

import java.util.Scanner;

public class Main1 {
    public String sol(String str){
        String answer = "";
        //int 최저값 디폴트화하기
        int m = Integer.MIN_VALUE;

        String[] s = str.split(" ");

        for(String x : s){
            int len = x.length();
            if(len > m){
                m = len;
                answer = x;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main1 M = new Main1();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(M.sol(str));
    }
}
