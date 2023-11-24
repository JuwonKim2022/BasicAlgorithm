package ch04HashMapTreeSet;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/*
<올바른 괄호>
괄호가 입력되면 올바른 괄호면 YES, 올바르지 않으면 NO
- 첫 번째 줄 괄호문자 입력, 문자열 최대 길이 30
==>stack 사용, LIFO - 나중에 들어간게 먼저 나옴
-----> 여는 괄호 스택에 차례로 push(), 닫는 괄호 순서에서 여는 괄호 pop(), 비었나 확인 isEmpty()
 */
public class Main011 {
    public String sol(String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()){
            if (x == '(') {
                stack.push(x);
            }else {
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
