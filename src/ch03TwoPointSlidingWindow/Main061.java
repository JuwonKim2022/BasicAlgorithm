package ch03TwoPointSlidingWindow;
import java.util.Scanner;
/*
<최대 길이 연속부분수열>
0과 1로 구성된 길이가 N인 수열,
최대 k번을 0을 1로 변경 > 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램 작성
- 첫 번째 줄에 수열의 길이인 자연수 5<=N<=100,000
- 두 번째 줄에 N길이의 0과 1로 구성된 수열
 ===> 투 포인트 알고리
 */
public class Main061 {
    public int sol(int n, int k, int[] arr){
        int answer=0, cnt=0, lt=0;
        for (int rt=0; rt<n; rt++){
            if (arr[rt]==0) cnt++;
            while (cnt>k){
                if (arr[lt]==0) cnt--;
                lt++;
            }
            answer=Math.max(answer, rt-lt+1);
        }
        return answer;
    }
    public static void main(String[] args) {
        Main061 T = new Main061();
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
