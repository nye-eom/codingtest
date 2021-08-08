package QPointerNSliding;

import java.util.ArrayList;
import java.util.Scanner;

/*
		question : N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.(첫 번째 수는 무조건 출력한다)
		input : 3
						1 3 5
						5
						2 3 6 7 9
		output :1 2 3 3 5 6 7 9
*/
public class QPointer1 {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;
        while(p1<n && p2<m) {
            if(a[p1]<b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while(p1<n) answer.add(a[p1++]);
        while(p2<m) answer.add(b[p2++]);
        return answer;
    }

    public static void main(String[] args){
        QPointer1 T = new QPointer1();
        Scanner kb=new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i]=kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for(int i=0; i<m; i++) {
            b[i]=kb.nextInt();
        }
        for(int x:T.solution(n,m,a,b)) System.out.print(x+" ");
    }
}
