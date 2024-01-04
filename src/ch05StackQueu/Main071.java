package ch05StackQueu;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
<교육과정 설계>
1년 과정 수업 계획, 필수과목 반드시 이수하고 순서도 정해짐
수업계획 잘 짜면 YES, 아니면 NO 출력
 */
public class Main071 {
    public String sol(String need, String plan){
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();

        for (char x : need.toCharArray()){
            Q.offer(x);
        }
        for (char x : plan.toCharArray()){
            if (Q.contains(x)){
                if (x != Q.poll()){
                    return "NO";
                }
            }
        }
        if (!Q.isEmpty()){
            return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Main071 T = new Main071();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(T.sol(a,b));
    }
}
