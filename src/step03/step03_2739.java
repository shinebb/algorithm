package step03;

import java.util.Scanner;

/*
* N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
* */
public class step03_2739 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        for(int i=1; i<=9; i++){
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
}
