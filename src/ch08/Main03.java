package ch08;

import java.util.*;

/*
 * <최대점수 구하기 - DFS>
 * N개의 문제 풀기, 제한시간 M 안에 N개의 문제 중 최대 점수 얻기
 *
 */
public class Main03 {
    static int answer = Integer.MIN_VALUE, n, m;
    boolean flag = false;
    public void DFS(int L, int sum, int time, int[] ps, int[] pt) {
        if(L==n) {
            answer = Math.max(answer, sum);
        }else {
            DFS(L+1, sum+ps[L], time+pt[L], ps, pt);
            DFS(L+1, sum, time, ps, pt);
        }
    }
    public static void main(String[] args) {
        Main03 T = new Main03();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        T.DFS(0, 0, 0, a, b);
        System.out.println(answer);
    }
}
