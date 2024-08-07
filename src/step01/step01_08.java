package step01;

import java.util.Scanner;

/*
* (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 * */
public class step01_08 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(a*(b%10));
        System.out.println(a*((b%100)/10));
        System.out.println(a*(b/100));
        System.out.println(a*b);
    }
}
