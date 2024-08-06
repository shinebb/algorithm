package step01;

import java.util.Scanner;

/*
* 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
* */
public class step01_05 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a = in.nextFloat();
        double b = in.nextFloat();

        System.out.println(a/b);
    }
}
