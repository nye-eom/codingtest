package QString;

import java.util.Scanner;

/*
		question : 앞에서 읽을때나 뒤에서 읽을 때나 문자열이라 부른다.
								문자열이 입력되면 해당 문자열이 팰린드롬이면 YES 아니면 NO를 출력한다.
								단, 회문을 검사할때 알파벳만가지고 회문을 검사하며 대소문자를 구분하지 않는다.
		input : found7, time: study; Ydults; emit, 7Dnuof
		output : YES
*/
public class QString8 {
    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        QString8 T = new QString8();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.print(T.solution(str));
    }
}
