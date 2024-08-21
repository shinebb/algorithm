package step05;

import java.util.Scanner;

/*
* 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
* */
public class step05_9086 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String [] newWord = new String[num];

        for(int i=0; i<num; i++){
            String word = in.next();
            newWord[i] = word.substring(0, 1) + word.substring(word.length()-1);
        }

        for(int i=0; i<newWord.length; i++){
            System.out.println(newWord[i]);
        }
    }
}
