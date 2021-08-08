package QRecursive;
/*
	question : 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수로를 합하여 다음 숫자가 되는 수열이다.
	input : 10
	output : 1 1 2 3 5 8 13 21 34 55

*/
public class QRecursive4 {
    static int[] fibo;

    public int DFS(int n) {
        if(fibo[n]>0) return fibo[n];//*시간복잡도 최소화

        if(n==1) return fibo[n]=1;
        else if(n==2) return fibo[n]=1;
        else return fibo[n]=DFS(n-2)+DFS(n-1);
    }

    public static void main(String[] args) {
        QRecursive4 T = new QRecursive4();
        int n = 10;
        fibo = new int[n+1];
        T.DFS(n);
        for(int i=1; i<=n; i++) System.out.print(fibo[i]+" ");
    }

    /*
    static int[] fibo;
    public int DFS(int n) {
        if(n==1) return fibo[n]=1;
        else if(n==2) return fibo[n]=1;
        else return fibo[n]=DFS(n-2)+DFS(n-1);
    }

    public static void main(String[] args) {
        QRecursive4 T = new QRecursive4();
        int n = 10;
        fibo = new int[n+1];
        T.DFS(n);
        for(int i=1; i<=n; i++) System.out.print(fibo[i]+" ");
    }
    */

    /*
    public int DFS(int n) {
        if(n==1) return 1;
        else if(n==2) return 1;
        else return DFS(n-2)+DFS(n-1);
    }

    //재귀함수는 Stack 프레임을 생성 매개변수,지역변수,복귀주소정보를 가진 프레임을 생성
    public static void main(String[] args) {
        QRecursive4 T = new QRecursive4();
        int n = 5;
        for(int i=1; i<=n; i++) System.out.print(T.DFS(n)+" ");
    }
    */

}
