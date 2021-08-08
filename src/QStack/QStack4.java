package QStack;

import java.util.Scanner;
import java.util.Stack;

/*
	question : 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
							만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다
	input : 352+*9-
	output : 12

*/
public class QStack4 {
    public int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) stack.push(x-48);//0:48, 1:49
            else {//연산자를 만났을 경우,
                int rt = stack.pop();
                int lt = stack.pop();
                if(x=='+') stack.push(lt+rt);
                if(x=='-') stack.push(lt-rt);
                if(x=='/') stack.push(lt/rt);
                if(x=='*') stack.push(lt*rt);
            }
        }
        answer=stack.get(0);
        return answer;
    }
    public static void main(String[] args){
        QStack4 T = new QStack4();
        Scanner in=new Scanner(System.in);
        String str = in.next();

        System.out.println(T.solution(str));

    }
}
