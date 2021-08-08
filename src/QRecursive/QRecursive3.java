package QRecursive;

/*
	question : 자연수 N이 입력되면 N! 를 구하는 프로그램을 작성하세요.(팩토리얼)
	input : 5
	output : 120

*/
public class QRecursive3 {
    public int DFS(int n) {
        if(n==0) return 1;
        else return n*DFS(n-1);
    }

    //재귀함수는 Stack 프레임을 생성 매개변수,지역변수,복귀주소정보를 가진 프레임을 생성
    public static void main(String[] args) {
        QRecursive3 T = new QRecursive3();
        System.out.print(T.DFS(5));
    }
}
