package step05;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
* 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
* 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
* (* 또한 문자열 앞 뒤에 공백이 있을 수 있다.)
* */
public class step05_1152 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String sentence = in.nextLine();

        StringTokenizer st = new StringTokenizer(sentence, " ");
        //split()을 사용할 경우, 공백이 들어왔을 때도 ""의 빈값이 배열로 들어가게 된다.

        System.out.println(st.countTokens());

    }
}
