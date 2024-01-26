package ch08;

import java.util.*;

/*
 * <섬나라 아일랜드>
 * N*N의 섬나라 지도 격자, 각 섬은 1로 표시, 상하좌우대각선 연결됨, 0은 바다
 * 섬 몇 개 있나 구하기
 */

class Main813{
    static int answer = 0, n;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    public void DFS(int x, int y, int[][] board) {
        for(int i=0; i<8; i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1) {
                board[nx][ny] = 0;
                DFS(nx, ny, board);
            }
        }
    }
    public void sol(int[][] board) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(board[i][j]==1) {
                    answer++;
                    board[i][j]=0;
                    DFS(i,j, board);
                }
            }
        }
    }

    public static void main(String[] args) {
        Main813 T = new Main813();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        T.sol(arr);
        System.out.println(answer);
    }
}
