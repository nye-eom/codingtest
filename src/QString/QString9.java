package QString;

import java.util.Scanner;

/*
		question : 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 자연수로 만든다.
		input : g0en2T0s8eSoft
		output : 208
*/
public class QString9 {
    public int solution(String str) {
		/*
		int answer= 0;
		for(char x : str.toCharArray()) {
			if(x>=48 && x<=57) answer = answer*10+(x-48);

		}
		*/
        String answer = "";
        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) 	answer +=x;

        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        QString9 T = new QString9();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.print(T.solution(str));
    }
}
