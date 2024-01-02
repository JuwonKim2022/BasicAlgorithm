package ch05StackQueu;

import java.util.Scanner;
import java.util.Stack;

/*
<올바른 괄호>
괄호가 입력되면 올바른 괄호면 YES, 아니면 NO
*/
public class Main011 {
    public String sol(String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()){
            if (x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return "NO";
        return answer;
    }
    public static void main(String[] args) {
        Main011 T = new Main011();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.sol(str));
    }
}
