package ch001;

import java.util.Scanner;

public class Main2 {
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
        Main2 M = new Main2();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(M.solution(str, c));
    }
}
