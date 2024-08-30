package step06;

import java.util.Scanner;

/*
* 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
* 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
*  */
public class step06_2444 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        for(int i=0; i<num; i++){
            for(int j=num; j>i+1; j--){
                System.out.print(" ");
            }
            for(int k=0; k<=i*2; k++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=1; i<num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=num*2-1; k>i*2; k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
