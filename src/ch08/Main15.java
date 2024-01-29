package ch08;

import java.util.*;

/*
 * <피자 배달 거리> - DFS
 * N*N 크기의 도시, 각 격자칸에 0은 빈칸, 1은 집, 2는 피자집
 * 각 격자칸은 좌표(행번호, 열, 번호)로 이루어짐
 * 행 번호 1~N, 열 번호 1~N , 각 집의 피자배달거리는 해당 집과 도시의 존재하는 피자집들과의 거리 중 최소값 = 피자배달거리
 * 시장 살릭고자 하는 M개만 선택할 때 도시의 최소 피자배달거리 값 출력
 */
class Point15{
    int x, y;
    Point15(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Main15{
    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point15> pz, hs;
    public void DFS(int L, int s) {
        if(L==m) {
            int sum = 0;
            for(Point15 h : hs) {
                int dis = Integer.MAX_VALUE;
                for(int i : combi) {
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x)+(h.y - pz.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer,  sum);
        }else {
            for(int i=s; i<len; i++) {
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }
    public static void main(String[] args) {
        Main15 T = new Main15();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pz = new ArrayList<>();
        hs = new ArrayList<>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                int tmp = sc.nextInt();
                if(tmp==1) hs.add(new Point15(i, j));
                else if(tmp==2) pz.add(new Point15(i, j));
            }
        }
        len = pz.size();
        combi = new int[m];
        T.DFS(0, 0);
        System.out.println(answer);
    }
}