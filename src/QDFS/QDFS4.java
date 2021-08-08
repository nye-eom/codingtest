package QDFS;

import common.Node;

/*
	말단노드()자식이 아예 없는 노드) - 개인 NOTION 참고
*/
public class QDFS4 {
    Node root;
    public int DFS(int L, Node root) {//최상위노드
        if(root.lt==null && root.rt==null) return L;//root가 가르기는 lv
        else return Math.min(DFS(L+1,root.lt), DFS(L+1,root.rt));

    }

    public static void main(String[] args) {
        QDFS4 tree = new QDFS4();
        tree.root= new Node(1);
        tree.root.lt= new Node(2);
        tree.root.rt= new Node(3);
        tree.root.lt.lt= new Node(4);
        tree.root.lt.rt= new Node(5);
        System.out.println(tree.DFS(0, tree.root));
    }
}
