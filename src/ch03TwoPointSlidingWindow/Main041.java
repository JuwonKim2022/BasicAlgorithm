package ch03TwoPointSlidingWindow;

import java.util.Scanner;

/*
<연속 부분수열>
N개 수로 이루어진 수열, 이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램 작성
--> 이중for문 말고
--> 투 포인트 : 두 포인트 가리키는거까지 합 구하고 저장해두기, it두고 rt증가하면서 더하고 확인 반복
----->다 돌면 lt값 빼고, 하나 증가 하고 반복
 */
public class Main041 {
    public int sol(int n, int m, int[] arr){
        int answer=0, sum=0, lt=0;
        for (int rt=0;rt<n; rt++){
            sum += arr[rt];
            if (sum==m){
                answer++;
            }
            while (sum>=m){
                sum-=arr[lt++]; //lt 가리키는 값 빼고 증가
                if (sum==m){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main041 T = new Main041();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.sol(n, m, arr));
    }
}
