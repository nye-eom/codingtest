package QBFS;

import common.Node;

import java.util.LinkedList;
import java.util.Queue;

public class QBFS2 {
    Node root;
    public int BFS(Node root) {//최상위노드
        Queue<Node> Q= new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()) {
            //lv 길이 구하기
            int len = Q.size();
            for(int i=0; i<len; i++) {
                Node cur = Q.poll();
                //말단노드인가 확인'
                if(cur.lt == null && cur.rt == null) return L;
                if(cur.lt != null) Q.offer(cur.lt);
                if(cur.rt != null) Q.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        QBFS2 tree = new QBFS2();
        tree.root= new Node(1);
        tree.root.lt= new Node(2);
        tree.root.rt= new Node(3);
        tree.root.lt.lt= new Node(4);
        tree.root.lt.rt= new Node(5);
        System.out.println(tree.BFS(tree.root));
    }
}
