package step05;

import java.util.Scanner;

/*
* 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다.
* 둘째 줄에 정수 i가 주어진다.
* S의 i번째 글자를 출력한다.
* */
public class step05_27866 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();
        int num = in.nextInt();

        word = word.substring(num-1, num);
        System.out.println(word);
    }
}
