package ch02Array;

import java.util.Scanner;

/*
임시 반장 정하기
1~5학년 지내오면서 한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장 : 복습하기
 */
public class Main111 {
    public int sol(int n, int[][] arr){
        int answer = 0, max = Integer.MIN_VALUE;
        for (int i=1; i<=n; i++){
            int cnt = 0;
            for (int j=1; j<=n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max){
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main111 T = new Main111();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];
        for (int i=1; i<=n; i++){ //i 학생 번호
            for (int j=1; j<=5; j++){ //j 학년
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(T.sol(n, arr));
    }
}
