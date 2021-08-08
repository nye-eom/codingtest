package QRecursive;

/*
	question : 10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요.
							단 재귀함수를 이용해서 출력해야 합니다.
	input : 11
	output : 1011

*/
public class QRecursive2 {
    public void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n/2);
            System.out.print(n%2+" ");
        }
    }

    //재귀함수는 Stack 프레임을 생성 매개변수,지역변수,복귀주소정보를 가진 프레임을 생성
    public static void main(String[] args) {
        QRecursive2 T = new QRecursive2();
        T.DFS(11);
    }
}
