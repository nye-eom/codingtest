package QArray;

import java.util.Scanner;

/*
		question :  자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
								만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.(에라토스테네스체 : 소수구하는 방법론 중 가장 빠른 방법론)
		input : 20
		output : 8
*/
public class QArray5 {
    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1];
        for(int i=2; i<=n; i++) {
            if(ch[i] == 0) {
                answer++;

                for(int j=i;j<=n; j=j+i) ch[j]=1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        QArray5 T = new QArray5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.print(T.solution(n));
    }
}
