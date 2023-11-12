package ch003;

import java.util.Scanner;

public class Main2 {
    public String sol(String str){
        String answer = "";
        //int 최저값 디폴트화하기
        int m = Integer.MIN_VALUE;
        int pos;

        while((pos = str.indexOf(' ')) != -1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();

            if(len > m){
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length() > m){
            answer = str;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main2 M = new Main2();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(M.sol(str));
    }
}
