package ch08;

import java.util.*;

/*
 * <토마토 - BFS활용>
 * 토마토를 격자 상자에 칸에 하나씩 보관, 하루 지나면 익은 토마토 주변 안 익은 토마토 익음
 * 며칠 수 모든 토마토가 다 익나? (1은 익은 토마토, 0은 익지 않은 토마토, -1은 빈칸)
 */

class Point09{
    public int x, y;
    Point09(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Main09{
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board, dis;
    static int n, m; //행과 열
    static Queue<Point09> Q = new LinkedList<>();
    public void BFS() {
        while(!Q.isEmpty()) {
            Point09 tmp = Q.poll();
            for(int i=0; i<4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx>=0 && nx<=n && ny>=0 && ny<m && board[nx][ny]==0) {
                    board[nx][ny]=1;
                    Q.offer(new Point09(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main09 T = new Main09();
        Scanner sc = new Scanner(System.in);
        board = new int[n][m];
        dis = new int[n][m];
        for(int i=0; i<=7; i++) {
            for(int j=0; j<=m; j++) {
                board[i][j] = sc.nextInt();
                if(board[i][j]==1) Q.offer(new Point09(i, j));
            }
        }
        T.BFS();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(board[i][j]==0) flag = false;
            }
        }
        if(flag) {
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    answer = Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        }else System.out.println(-1);
    }
}
