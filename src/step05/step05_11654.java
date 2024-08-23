package step05;

import java.util.Scanner;

/*
* 입력으로 주어진 글자의 아스키 코드 값을 출력한다.
* */
public class step05_11654 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //String은 char로 쪼갤 수 있고, char타입은 아스키 코드로 변환이 가능하다.
        char word = in.nextLine().charAt(0);
        int code = word;

        System.out.println(code);
    }
}
