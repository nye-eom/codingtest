package QStack;

import java.util.Scanner;
import java.util.Stack;

/*
	question : 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
	input : (A(BC)D)EF(G(H)(IJ)K)LM(N)
	output : EFLM

*/
public class QStack2 {
    public String solution(String str) {
        String answer="";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()) {
            if(x==')') {
                while(stack.pop()!='(') {//꺼낸 값을 return

                }
            }else {
                stack.push(x);
            }
        }

        for(int i=0; i<stack.size(); i++) answer+=stack.get(i);
        return answer;
    }
    public static void main(String[] args){
        QStack2 T = new QStack2();
        Scanner in=new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));

    }
}
