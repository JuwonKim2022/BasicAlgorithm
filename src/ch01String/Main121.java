package ch01String;
/*
현수는 영희에게 알파벳 대문자로 구성된 비밀번호를 매일 컴퓨터를 이용해 보냄. 비밀편지는 두 사람이 서로 약속한 암호로 구성.
비밀편지 알파벳 한 문자마다 #,*이 일곱 개로 구성. #=1,*=0 -> 2진수 -> 10진수 = 아스키 -> 문자로
 */

import java.util.Scanner;

public class Main121 {
    public String sol(int n, String s){
        String answer = "";
        for(int i=0; i<n; i++){
            String tmp = s.substring(0,7).replace('#', '1').replace('*', '0'); //앞에 7개만 뽑아냄 + 문자 바꾸기
            int num = Integer.parseInt(tmp, 2); //2진수를 10진수로 바꿈
            answer += (char)num;
            System.out.println(tmp);
            s =s.substring(7);  //계속 7개씩 뽑아냄
            System.out.println(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main121 T = new Main121();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.sol(n, str));
    }
}
