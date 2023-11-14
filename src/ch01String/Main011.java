package ch01String;

import java.util.Scanner;

public class Main011 {

    public int solution(String str, char c){
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == c){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main011 M = new Main011();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(M.solution(str, c));
    }

    public static class Main031 {
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
            Main031 M = new Main031();
            Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();

            System.out.println(M.sol(str));
        }
    }
}
