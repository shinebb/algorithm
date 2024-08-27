package step05;

import java.util.Scanner;

/*
* 입력 받은 대로 출력하는 프로그램을 작성하시오.
* */
public class step05_11718 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNextLine()){
            String word = in.nextLine();
            System.out.println(word);
        }
        in.close();
    }
}
