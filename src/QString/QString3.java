package QString;

import java.util.Scanner;

/*
		question : 문장 중 가장 긴 단어를 출력
		input : it is time to study
		output : study
*/
public class QString3 {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
		/* optional 1
		String[] s = str.split(" ");
		for(String x : s){
			int len = x.length();
			if(len>m) {
				m=len;
				answer=x;
			}
		}
		*/

        while((pos = str.indexOf(" ")) !=-1) {//띄어쓰기 위치를 출력
            String tmp = str.substring(0,pos);
            int len = tmp.length();
            if(len>m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length() > m) answer = str;
        return answer;
    }

    public static void main(String[] args) {
        QString3 T = new QString3();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
