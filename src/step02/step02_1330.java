package step02;

import java.util.Scanner;

/*
* 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
* */
public class step02_1330 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        if(a>b) System.out.println(">");
        if(a<b) System.out.println("<");
        if(a==b) System.out.println("==");
    }
}
