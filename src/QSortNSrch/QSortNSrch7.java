package QSortNSrch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
	question : N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.
						정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.
	input : 5
					2 7
					1 3
					1 2
					2 5
					3 6
		output : 1 2
						1 3
						2 5
						2 7
						3 6

*/

class Point implements Comparable<Point> {
    public int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) return this.y-o.y;
        else return this.x-o.x;
    }
}

public class QSortNSrch7 {

    public static void main(String[] args){
        QSortNSrch7 T = new QSortNSrch7();
        Scanner kb=new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);
        for(Point o : arr) {
            System.out.println(o.x+" "+o.y);
        }
    }
}
