package ch07;
/*
<이진트리>
전위순회 출력
중위순회 출력
후위순회 출력
 */
class Node{
    int data;
    Node lt, rt;
    public Node(int val){
        data = val;
        lt = rt = null;
    }
}
public class Main05 {
    Node root;
    public void DFS(Node root){
        if(root == null) {
            return;
        }else{
            DFS(root.lt);
            DFS(root.rt);
            System.out.println(root.data + " ");
        }
    }
    public static void main(String args[]){
        Main05 tree = new Main05();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt = new Node(4);
        tree.root.rt = new Node(5);
        tree.root.lt = new Node(6);
        tree.root.rt = new Node(7);
    }
}
