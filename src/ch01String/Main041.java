package ch01String;

import java.util.ArrayList;
import java.util.Scanner;

public class Main041 {

    public ArrayList<String> sol(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main041 M = new Main041();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = sc.next();
        }
        for(String x : M.sol(n, str)){
            System.out.println(x);
        }
    }
}
