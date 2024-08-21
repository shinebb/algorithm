package step05;

import java.util.Scanner;

/*
* 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다.
* 둘째 줄에 정수 i가 주어진다.
* S의 i번째 글자를 출력한다.
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
