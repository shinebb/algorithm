package step06;

import java.util.Scanner;

/*
* 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
* 팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
* level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.
*  */
public class step06_10988 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String word = in.nextLine().trim();
        String reverse = "";

        for(int i=word.length()-1; i>=0; i--){
            reverse += word.charAt(i);
        }

        if(word.equals(reverse)) System.out.println("1");
        else System.out.println("0");

    }
}
