package ch001;

import java.util.Scanner;

public class Main1 {

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
        Main1 M = new Main1();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(M.solution(str, c));
    }
}
