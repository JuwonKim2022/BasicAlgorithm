package ch08;

import java.util.*;

/*
 * <조합 구하기>
 * 1부터 N까지 번호 적힌 구슬, 이 중 M개 뽑는 방법의 수 출력 프로그램
 */
public class Main12 {
    static int[] combi;
    static int n, m;
    public void DFS(int L, int s) {
        if(L==m) {
            for(int x : combi) System.out.println(x+" ");
            System.out.println();
        }else {
            for(int i=s; i<=n; i++) {
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Main12 T = new Main12();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        combi = new int[m];
        T.DFS(0, 1);
    }
}


