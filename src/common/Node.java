package common;

public class Node {
    int data;
    public Node lt;
    public Node rt;//Node라는 클래스의 객체저장
    public Node(int val) {
        data = val;
        lt=rt=null;
    }
}
