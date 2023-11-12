package ch05;

import java.util.*;

public class Main1 {

    public String sol(String str){
        String answer;
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length()-1;

        while(lt<rt){
            if(!Character.isAlphabetic(s[lt])){
                lt++;
            }else if(!Character.isAlphabetic(s[rt])){
                rt--;
            }else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        Main1 M = new Main1();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(M.sol(str));
    }
}
