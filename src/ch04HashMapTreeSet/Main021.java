package ch04HashMapTreeSet;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/*
<괄호문자 제거>
입력된 문자열에서 소괄호 () 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력
- 첫 번째 줄에 문자열, 문자열 길이 100 안 넘음
==>남은 문자만 출력
*/
public class Main021 {
    public String sol(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()){
            if (x==')'){
                while(stack.pop()!='('); //)ㄱ빼고 다음거 출력도 함
            }else{
                stack.push(x);
            }
        }
        for (int i=0; i<stack.size(); i++) answer += stack.get(i);
        return answer;
    }
    public static void main(String[] args) {
        Main021 T = new Main021();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.sol(str));
    }
}
