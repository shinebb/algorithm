package step03;

import java.util.Scanner;

/*
* n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
* */
public class step03_8393 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int sum = 0;

        for(int i=1; i<=num; i++){
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
