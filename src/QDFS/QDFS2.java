package QDFS;

/*
	question : 자연수 N 이 주어지면 1부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력
	input : 3
	output : 1 2 3
						1 2
						1 3
						1
						2 3
						2
						3
*/
public class QDFS2 {
    static int n;
    static int[] ch;
    public void DFS(int L) {
        if(L==n+1) {
            String tmp = "";
            for(int i=1; i<=n; i++) {
                if(ch[i]==1) tmp+=(i+ " ");
            }
            if(tmp.length()>0) System.out.println(tmp);
        }else{
            ch[L]=1;//index라고 생각하고 진행
            DFS(L+1);//사용
            ch[L]=0;
            DFS(L+1);//사용X
        }

    }

    public static void main(String[] args) {
        QDFS2 T = new QDFS2();
        n=3;
        ch = new int[n+1];
        T.DFS(1);
    }
}
