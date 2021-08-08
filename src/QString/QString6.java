package QString;

import java.util.Scanner;

/*
		question : 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하시오.
		input : ksekkset
		output : kset
*/
public class QString6 {
    public String solution(String str) {
        String answer = "";
        for(int i=0; i<str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) answer+=str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        QString6 T = new QString6();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.print(T.solution(str));
    }
}
