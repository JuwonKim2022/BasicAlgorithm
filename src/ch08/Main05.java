package ch08;

import java.util.*;

/*
 * <동전교환>
 * 여러 단위 동전들 주어짐, 거스름돈 가장 적은 수로 교환
 * D(L,동전의 갯수   Sum,L개의 동전의 통합)
 *
 * 타임아웃 : 내림차순으로 검색 돌리기
 */
public class Main05 {
    static int n, m, answer = Integer.MAX_VALUE;
    public void DFS(int L, int sum, Integer[] arr) {
        if(sum>m) return;
        if(L >= answer) return;
        if(sum==m) {
            answer = Math.min(answer, L);
        }else {
            for(int i=0; i<n; i++) {
                DFS(L+1, sum+arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Main05 T = new Main05();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        m = sc.nextInt();
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
