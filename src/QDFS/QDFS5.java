package QDFS;

import java.util.ArrayList;
import java.util.Scanner;

/*
* 경로탐색 - 개인 NOTION 확인 (한번 반복된 노드는 재방문 하지 않는다. EX) 1 -> 2 -> 1 불가)
* */
public class QDFS5 {
    static int n, m, answer=0;
    static int[][] graph;
    static int[] ch;
    public void DFS(int v) {
        if(v==n) answer++;
        else {
            for(int i=1; i<=n; i++) {
                if(graph[v][i]==1 && ch[i]==0) {
                    ch[i]=1;
                    DFS(i);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        QDFS5 T = new QDFS5();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();//노드개수
        m = kb.nextInt();//간선개수
        graph = new int[n+1][n+1];//1번 부터 n번 인덱스 부터
        ch = new int[n+1];//방문여부
        for(int i=0; i<m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph[a][b] = 1;
        }
        ch[1]=1;
        T.DFS(1);
        System.out.println(answer);
    }
    /*
    //인접리스트 풀이
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void DFS(int v) {
        if(v==n) answer++;
        else {
            //v번 arrayList
            for(int nv : graph.get(v)) {
                if(ch[nv]==0) {
                    ch[nv]=1;
                    DFS(nv);
                    ch[nv]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        QDFS5 T = new QDFS5();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for(int i=0; i<m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
*/
}
