package step03;

import java.util.Scanner;

/*
* 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
* 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
* */
public class step03_10950 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        for(int i=0; i<num; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a+b);
        }
    }
}
