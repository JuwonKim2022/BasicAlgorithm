package ch03TwoPointSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
최대 매출
N일 매출 기록 주고 연속된 K일 동안의 최대 매출력이 얼마인지 구하기
->슬라이딩 윈도우
 */
public class Main031 {
    public int sol(int n, int k, int[] arr){
        int answer = 0, sum = 0;
        for (int i=0; i<k; i++){
            sum += arr[i];
        }
        answer = sum;
        for (int i=k; i<n; i++){
            sum += (arr[i]=arr[i-k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main031 T = new Main031();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.sol(n, k, arr));
    }
}
