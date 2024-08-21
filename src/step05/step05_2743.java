package step05;

import java.util.Scanner;

/*
* 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
* */
public class step05_2743 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        System.out.println(word.length());
    }
}
