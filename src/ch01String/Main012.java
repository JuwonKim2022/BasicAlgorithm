package ch01String;

import java.util.Scanner;

public class Main012 {
    public int solution(String str, char c){
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for(char x : str.toCharArray()){
            if(x == c){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main012 M = new Main012();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(M.solution(str, c));
    }
}
