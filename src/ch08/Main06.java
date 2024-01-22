package ch08;

import java.util.*;

/*
 * <조합의 경우수>
 * nCr = n-1Cr-1 + n-1Cr
 */
public class Main06 {
    int[][] dy = new int[35][35];
    public int DFS(int n, int r) {
        if(dy[n][r]>0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return dy[n][r] = DFS(n-1, r-1)+DFS(n-1,r);
    }
    public static void main(String[] args) {
        Main06 T = new Main06();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(T.DFS(n, r));
    }
}