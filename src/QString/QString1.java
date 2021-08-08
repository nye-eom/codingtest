package QString;

import java.util.Scanner;

/*
		question : 첫 줄에 해당 문자의 개수를 출력한다.
		input : Computercooler
						c
		output : 2
*/
public class QString1 {

    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
		/* optional 1
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == t) answer++;
		}
		*/

        for(char x : str.toCharArray()) {
            if(x == t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        QString1 T = new QString1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.println(T.solution(str, c));
    }
}
