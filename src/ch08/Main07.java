package ch08;

import java.util.*;

/*
 * <미로 탐색 - DFS>
 * 7*7 격자판 미로 탈출 경우의 수 출력
 * 출발점 (1,1), 탈출 도착점 (7,7), 격자판의 1은 벽, 0은 이동통로, 움직임은 상하좌우만 가능
 *
 * (N) (C)
 * (좌표 전체)
 */
class Main07{
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int answer = 0;

    public void DFS(int x, int y) {
        if(x==7 && y==7) {
            answer++;
        }else {
            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx > 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny]==0) {
                    board[nx][ny] = 1;
                    DFS(nx, ny);
                    board[nx][ny]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main07 T = new Main07();
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];
        for(int i=0; i<=7; i++) {
            for(int j=1; j<=7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        board[1][1] = 1;
        T.DFS(1, 1);
        System.out.println(answer);
    }
}
