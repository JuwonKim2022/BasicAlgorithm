package ch02Array;

import java.util.Scanner;

/*
지도 N*N 격자판 -> 자신의 상하좌우 숫자보다 큰 숫자는 봉우리
봉우리 몇 개인가?
입력 격자 주변은 0
 */
public class Main101 {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    public int sol(int n, int[][] arr){
        int answer = 0;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main101 T = new Main101();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(T.sol(n, arr));
    }
}
