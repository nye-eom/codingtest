package QPointerNSliding;

import java.util.Scanner;

/*
 *   최대길이 연속부분수열 - 개인 Notion 문제 참고
 * */
public class QPointerNSliding2 {
    public int solution(int n, int k, int[] arr) {
        int answer=0, cnt=0, lt=0;
        for(int rt=0; rt<n; rt++) {
            if(arr[rt]==0) cnt++;
            while(cnt>k) {
                if(arr[lt]==0) cnt--;
                lt++;
            }
            answer=Math.max(answer, rt-lt+1);
        }

        return answer;
    }

    public static void main(String[] args){
        QPointerNSliding2 T = new QPointerNSliding2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }
}
