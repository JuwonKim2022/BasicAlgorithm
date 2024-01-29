package ch08;

import java.util.*;

/*
 * <섬나라 아일랜드> - BFS
 * N*N의 섬나라 지도 격자, 각 섬은 1로 표시, 상하좌우대각선 연결됨, 0은 바다
 * 섬 몇 개 있나 구하기
 */
class Point14{
    int x, y;
    Point14(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Main14{
    static int answer = 0, n;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    Queue<Point14> queue = new LinkedList<>();
    public void BFS(int x, int y, int[][] board) {
        queue.add(new Point14(x, y));
        while (!queue.isEmpty()) {
            Point14 pos = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nx = pos.x + dx[i];
                int ny = pos.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    queue.add(new Point14(nx, ny));
                }
            }
        }
    }

    public void sol(int[][] board) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(board[i][j]==1) {
                    board[i][j]=0;
                    BFS(i,j, board);
                    answer++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main14 T = new Main14();
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
