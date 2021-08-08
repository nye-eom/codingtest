package QQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 *   교욱과정설계 - 개인 Notion 문제 참고
 * */
public class QQueue2 {
    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for(char x : need.toCharArray()) Q.offer(x);
        for(char x : plan.toCharArray()) {
            if(Q.contains(x)) {
                if(x!=Q.poll()) return "NO";
            }
        }
        if(!Q.isEmpty()) return "NO";
        return answer ;
    }
    public static void main(String[] args){
        QQueue2 T = new QQueue2();
        Scanner kb=new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.println(T.solution(a,b));
    }
}
