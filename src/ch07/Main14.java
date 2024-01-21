package ch07;
import java.util.*;

/*
 * <그래프 최단거리 - BFS>
 *  1번에서 각 정점으로 가는 최소의 수
 */
public class Main14 {
    static int n, m = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;
    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        queue.offer(v);
        while(!queue.isEmpty()){
            int cv =  queue.poll();
            for(int nv : graph.get(cv)) {
                if(ch[nv]==0) {
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv]+1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Main14 T = new Main14();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<m; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for(int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        T.BFS(1);
        for (int i=2; i<=n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}