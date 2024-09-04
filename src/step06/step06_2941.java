package step06;

import java.util.Scanner;

/*
* 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
* 단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.
* 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
*  */
public class step06_2941 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] alpha = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        String word = in.nextLine().trim();

        for(int i=0; i<alpha.length; i++) {
            if(word.contains(alpha[i])){
                word = word.replace(alpha[i], "?");
            }
        }

        System.out.println(word.length());

    }
}
