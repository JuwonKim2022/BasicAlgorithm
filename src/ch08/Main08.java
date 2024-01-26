package ch08;

import java.util.*;

/*
 * <미로 탐색 - BFS>
 * 7*7 격자판 미로 탈출 경우의 수 출력
 * 출발점 (1,1), 탈출 도착점 (7,7), 격자판의 1은 벽, 0은 이동통로, 움직임은 상하좌우만 가능
 */
class Point{
    public int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Main08{
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board, dis;

    public void BFS(int x, int y) {
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x,y));
        board[x][y]=1;
        while(!Q.isEmpty()) {
            Point tmp = Q.poll();
            for(int i=0; i<4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny]==0) {
                    board[nx][ny]=1;
                    Q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main08 T = new Main08();
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];
        dis = new int[8][8];
        for(int i=0; i<=7; i++) {
            for(int j=1; j<=7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        T.BFS(1, 1);
        if(dis[7][7]==0) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }
}
