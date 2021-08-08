package QString;

import java.util.Scanner;

/*
		question : 앞에서 읽을때나 뒤에서 읽을 때나 같은 문자열일 경우, YES 아닐 경우 NO 출력
		input : gooG
		output : YES
*/
public class QString7 {
    public String solution(String str) {
        String answer = "YES";
		/* optional 1
		int len = str.length();
		str = str.toUpperCase();
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
		}
		*/

        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(tmp)) return "NO";

        return answer;
    }

    public static void main(String[] args) {
        QString7 T = new QString7();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.print(T.solution(str));
    }
}
