package ch08;

import java.util.*;

/*
 * <중복순열 구하기>
 * 1~N까지 번호 적힌 구슬,중복을 허락하여 M번을 뽑아 일렬로 나열하는 방법 수
 *
 */
public class Main04 {
    static int[] pm;
    static int n, m;
    public void DFS(int L) {
        if(L==m) {
            for(int x : pm) System.out.println(x + " ");
            System.out.println();
        }else {
            for(int i=1; i<=n; i++) {
                pm[L]=i;
                DFS(L+1);
            }
        }
    }
    public static void main(String[] args) {
        Main04 T = new Main04();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        T.DFS(0);
    }
}
