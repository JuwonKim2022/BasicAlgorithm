package ch07;

import java.util.*;

/*
 * <Tree 말단 노드따기의 가장 짧은 경로>
 * 간선 갯수 당 1
 * BFS로
 */
class Node1{
    int data;
    Node1 lt, rt;
    public Node1(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Main10 {
    Node1 root;
    public int BFS(Node1 root) {
        Queue<Node1> Q = new LinkedList<Node1>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()) {
            int len = Q.size();
            for(int i=0; i<len; i++) {
                Node1 cur = Q.poll();
                if(cur.lt == null && cur.rt == null) {
                    return L;
                }
                if(cur.lt != null) {
                    Q.offer(cur.lt);
                }
                if(cur.rt != null) {
                    Q.add(cur.rt);
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Main10 tree = new Main10();
        tree.root = new Node1(1);
        tree.root.lt = new Node1(2);
        tree.root.rt = new Node1(3);
        tree.root.lt.lt = new Node1(4);
        tree.root.rt.rt = new Node1(5);
        System.out.println(tree.BFS(tree.root));
    }
}
