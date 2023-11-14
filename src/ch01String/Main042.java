package ch01String;

import java.util.ArrayList;
import java.util.Scanner;

public class Main042 {

    public ArrayList<String> sol(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while(lt<rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main042 M = new Main042();
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
