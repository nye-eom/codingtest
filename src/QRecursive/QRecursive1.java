package QRecursive;

/*
	question : 자연수 N 이 입력되면 재귀함수를 이용하여 1부터 N까지 출력하는 프로그램을 작성하세요.
	input : 3
	output : 1 2 3

*/
public class QRecursive1 {
    public void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n-1);
            System.out.print(n+" ");
        }
    }

    //재귀함수는 Stack 프레임을 생성 매개변수,지역변수,복귀주소정보를 가진 프레임을 생성
    public static void main(String[] args) {
        QRecursive1 T = new QRecursive1();
        T.DFS(3);
    }
}
