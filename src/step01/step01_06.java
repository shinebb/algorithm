package step01;

import java.util.Scanner;

/*
* 첫째 줄에 준하의 놀람을 출력한다. 놀람은 아이디 뒤에 ??!를 붙여서 나타낸다.
 * */
public class step01_06 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String id = in.nextLine();

        System.out.println(id + "??!");
    }
}
