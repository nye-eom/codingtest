package QString;

import java.util.Scanner;
/*
		question : 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고
								특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하시오.
		input : a#b!GE*t@S
		output : S#T!EG*b@a
*/
public class QString5 {
    public String solution(String str) {
        String answer = "";
        char[] s= str.toCharArray();
        int lt=0, rt = str.length()-1;
        while(lt<rt) {
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt++;
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        QString5 T = new QString5();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
