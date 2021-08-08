package QString;

import java.util.Scanner;

/*
		question : 대소문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 출력한다.
		input : StuDY
		output : sTUdy
*/
public class QString2 {
    public String solution(String str) {
        String answer = "";

        for(char x : str.toCharArray()) {
		/* optional 1
			if(Character.isLowerCase(x)) {
				answer += Character.toUpperCase(x);
			}else {
				answer += Character.toLowerCase(x);
			}
		*/

            //대문자 : 65~90, 소문자 : 97~122
            if(x>=65 && x<=90) {
                answer += (char)(x+32);
            }else {
                answer += (char)(x-32);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        QString2 T = new QString2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
