package QStack;

import java.util.Scanner;
import java.util.Stack;

/*
 *   쇠막대기 - 개인 Notion 문제 참고
 * */
public class QStack5 {
    public int solution(String str) {
        int answer=0;boolean razorYN = false;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '(') stack.push('(');
            else {
                stack.pop();
                if(str.charAt(i-1)=='(') answer+=stack.size();
                else answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        QStack5 T = new QStack5();
        Scanner in=new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));

    }
}
