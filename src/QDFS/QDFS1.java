package QDFS;

/*
	전위순위 : 부모 -> 왼쪽 자식 -> 오른쪽자식
	중위순위 : 왼쪽 자식 -> 부모 -> 오른쪽자식
	후위순위 : 왼쪽 자식 -> 오른쪽자식 -> 부모
*/

import common.Node;

public class QDFS1 {
    Node root;
    public void DFS(Node root) {//최상위노드
        if(root==null) return;
        else{
            //System.out.print(root.data+" ");//전위순회
            DFS(root.lt);
            //System.out.print(root.data+" ");//중위순회
            DFS(root.rt);
            //System.out.print(root.data+" ");//후위순회
        }
    }

    public static void main(String[] args) {
        QDFS1 tree = new QDFS1();
        tree.root= new Node(1);
        tree.root.lt= new Node(2);
        tree.root.rt= new Node(3);
        tree.root.lt.lt= new Node(4);
        tree.root.lt.rt= new Node(5);
        tree.root.rt.lt= new Node(6);
        tree.root.rt.rt= new Node(7);
        tree.DFS(tree.root);
    }
}
