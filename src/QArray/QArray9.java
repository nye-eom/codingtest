package QArray;

import java.util.Scanner;

/*
 *   격자판 최대합 - 개인 Notion 문제 참고
 * */
public class QArray9 {
    public int solution(int n, int[][] arr) {
        int answer=Integer.MIN_VALUE;
        int sum1; //행
        int sum2;//열
        for(int i=0; i<n; i++) {
            sum1=sum2=0;
            for(int j=0; j<n; j++) {
                sum1+=arr[i][j];
                sum2+=arr[j][i];
            }
            answer=Math.max(answer, sum1);
            answer=Math.max(answer, sum2);
        }

        sum1=sum2=0;//대각선
        for(int i=0; i<n; i++) {
            sum1+=arr[i][i];
            sum2+=arr[i][n-i-1];
        }
        answer=Math.max(answer, sum1);
        answer=Math.max(answer, sum2);
        return answer;
    }

    public static void main(String[] args) {
        QArray9 T = new QArray9();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n,arr));
    }
}
