package QString;

import java.util.Scanner;

/*
		question : 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소 거리를 출력하시오.
		input : teachermode e
		output : 1 0 1 2 1 0 1 2 2 1 0
*/
public class QString10 {
    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        int p = 1000;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == c)	{
                p=0;
                answer[i] = p;
            }	else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for(int i=str.length()-1; i>=0; i--) {
            if(str.charAt(i) == c){
                p=0;
            }else {
                p++;
                answer[i]=Math.min(answer[i],p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        QString10 T = new QString10();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for(int x : T.solution(str, c)){
            System.out.print(x+" ");
        }
    }
}
