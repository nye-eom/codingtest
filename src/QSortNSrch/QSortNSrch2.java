package QSortNSrch;

import java.util.Scanner;

/*
	question : N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
							정렬하는 방법은 버블정렬입니다.
	input : 6
					13 5 11 7 23 15
	output : 5 7 11 13 15 23

*/
public class QSortNSrch2 {
    public int[] solution(int n, int[] arr) {
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        QSortNSrch2 T = new QSortNSrch2();
        Scanner kb=new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = kb.nextInt();
        for(int x : T.solution(n,arr)) {System.out.print(x+" ");}

    }
}
