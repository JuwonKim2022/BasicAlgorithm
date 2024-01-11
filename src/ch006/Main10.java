package ch006;

import java.util.*;

/*
 * <결정 알고리즘>
 * N개의 마굿간이 수직선상. 각 마굿간 x1, x2...xN 순서.좌표 중복 없음
 * C마리 말, 각 마굿간에 한 마리 말만 넣음, 가장 가까운 두 말의 거리가 최대가 되도록
 * 최대값음?
 *
 * (N) (C)
 * (좌표 전체)
 */

class Main010{
    public int count(int[] arr, int dist) {
        int cnt = 1;
        int ep = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i]-ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    public int sol(int n, int c, int[] arr) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Main010 T = new Main010();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(T.sol(n, c, arr));
    }
}
