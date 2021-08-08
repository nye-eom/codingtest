package QPointerNSliding;

import java.util.Scanner;

/*
	question : N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.

							만약 N=15이면

							7+8=15

							4+5+6=15

							1+2+3+4+5=15

							와 같이 총 3가지의 경우가 존재한다.

	input : 15
	output : 3
*/
public class QPointer3 {
    public int solution(int n) {
		/*
		int answer=0, sum=0, lt=0;
		int m=n/2+1;
		int[] arr = new int[m];
		for(int i=0; i<m; i++) arr[i]=i+1;
		for(int rt=0; rt<m; rt++) {
			sum+=arr[rt];
			if(sum==n) answer++;
			while(sum>=n) {
				sum-=arr[lt++];
				if(sum==n) answer++;
			}

		}
*/
        int answer=0, cnt=1;
        n--;//1빼기
        while(n>0) {
            cnt++;
            n=n-cnt;//2빼기
            if(n%cnt==0) answer++;
        }
        return answer;
    }

    public static void main(String[] args){
        QPointer3 T = new QPointer3();
        Scanner kb=new Scanner(System.in);
        int n = kb.nextInt();
        System.out.print(T.solution(n));
    }
}
