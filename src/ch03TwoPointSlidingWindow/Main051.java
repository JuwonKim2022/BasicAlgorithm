package ch03TwoPointSlidingWindow;

import java.util.Scanner;

/*
<연속된 자연수의 합 1>
N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램
- 첫 번째 줄에 양의 정수 7<=N<=1000

=> 투 포인트
 */
public class Main051 {
    public int sol(int n){
        int answer=0, sum=0, lt=0;
        int m = n/2+1;
        int[] arr = new int[m];
        for (int i=0; i<m; i++) arr[i]=i+1;
        //투포인트 알고리즘
        for (int rt=0; rt<m; rt++) {
            sum+=arr[rt];
            if(sum==n) answer++;
            while (sum>=n){
                sum-=arr[lt++];
                if (sum==n) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main051 T = new Main051();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(T.sol(n));
    }
}
