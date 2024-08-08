package step01;

import java.util.Scanner;

/*
* 이제 A + B + C를 계산할 차례이다! (1 ≤ A, B, C ≤ 10의12제곱)
 * */
public class step01_11382 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Long a = in.nextLong();
        Long b = in.nextLong();
        Long c = in.nextLong();
        //A,B,C의 범위가 1부터 10의 12제곱이므로 Long 타입을 사용해주어야한다.
        //int의 경우 10의 9제곱, long은 10의 18제곱이다.

        System.out.println(a+b+c);
    }
}
