package step01;

import java.util.Scanner;

/*
* 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
* 조건 : 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
* */
public class step01_1008 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a = in.nextFloat();
        double b = in.nextFloat();

        System.out.println(a/b);
    }
}
