package QPointerNSliding;

import java.util.Scanner;

/*
 *   최대매출 - 개인 Notion 문제 참고
 * */
public class QSliding1 {
    public int solution(int n, int k, int[] arr) {
        int answer=0, sum=0;
        for(int i=0; i<k; i++) sum+=arr[i];
        answer = sum;
        for(int i=k; i<n; i++) {
            sum+=(arr[i]-arr[i-k]);
            answer = Math.max(answer, sum);
        }


        return answer;
    }

    public static void main(String[] args){
        QSliding1 T = new QSliding1();
        Scanner kb=new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }
}
