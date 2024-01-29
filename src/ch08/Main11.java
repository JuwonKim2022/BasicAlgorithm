package ch08;

import java.util.*;

/*
 * <수열 추측하기>
 * 가장 윗줄에 1부터 N까지 숫자 적힘, 둘때 줄부터 차례대로 파스칼의 삼각형처럼 두 수 더한 값 저장
 * N, 가장 밑 숫자 주어질 때 가장 윗줄 숫자 구하는 프로그램
 */

public class Main11 {
    static int[] b, p, ch;
    static int n, f;
    boolean flag = false;
    int[][] dy = new int[35][35];
    public int combi(int n, int r) {
        if(dy[n][r]>0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return dy[n][r] = combi(n-1, r-1)+combi(n-1,r);
    }

    public void DFS(int L, int sum) {
        if(flag) return;
        if(L==n) {
            if(sum==f) {
                for(int x : p) System.out.println(x+" ");
                flag = true;
            }
        }else {
            for(int i=1; i<=n; i++) {
                if(ch[i]==0) {
                    ch[i]=1;
                    p[L]=i;
                    DFS(L+1, sum+(p[L])*b[L]);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main11 T = new Main11();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        b = new int[n];
        p = new int[n];
        ch = new int[n+1];
        for(int i=0; i<n; i++) {
            b[i] = T.combi(n-1, i);
        }
        T.DFS(0, 0);
    }
}
