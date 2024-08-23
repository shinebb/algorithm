package step05;

import java.util.Scanner;

/*
* 입력으로 주어진 숫자 N개의 합을 출력한다.
* */
public class step05_11720 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        String word = in.next();
        int sum = 0;

        for(int i=0; i<num; i++){
            sum += Integer.parseInt(word.substring(i, i+1));
        }

        System.out.println(sum);
    }
}
