package step03;

import java.util.Scanner;

/*
* int 앞에 long을 하나씩 더 붙일 때마다 4바이트씩 저장할 수 있는 공간이 늘어난다.
* 첫 번째 줄에는 문제의 정수 N이 주어진다.
* 혜아가 N바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력하여라.
*/
public class step03_25314 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        for(int i=0; i<num/4; i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
