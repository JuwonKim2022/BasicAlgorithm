package ch07;

/*
 * <Tree 말단 노드따기의 가장 짧은 경로>
 * 간선 갯수 당 1
 * DFS로(BFS가 정답)
 */
//class Node{
//	int data;
//	Node lt, rt;
//	public Node(int val) {
//		data = val;
//		lt = rt = null;
//	}
//}
public class Main09 {
    Node root;
    public int DFS(int L, Node root) {
        if(root.lt==null && root.rt==null) {
            return L;
        }else {
            return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
        }
    }

    public static void main(String[] args) {
        Main09 tree = new Main09();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.rt.rt = new Node(5);
        System.out.println(tree.DFS(0, tree.root));
    }
}
