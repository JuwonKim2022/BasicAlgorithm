package ch08;
import java.util.*;
/*
 * <바둑이 승차 - DFS>
 * 트럭에 C 킬로그램 넘게 못 싫음,N마리의 바둑이, 각 바둑이 무게 W
 * 철수가 트럭에 태울 수 있는 가장 무거운 무게 구하기
 */
public class Main02 {
    static int answer = Integer.MIN_VALUE, c, n;
    boolean flag = false;
    public void DFS(int L, int sum, int[] arr) {
        if(sum>c) return;
        if(L==n) {
            answer = Math.max(answer, sum);
        }else {
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Main02 T = new Main02();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
