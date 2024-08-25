package step05;

import java.util.Scanner;

/*
* 첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
* 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
* */
public class step05_2908 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String num1 = in.next();
        String num2 = in.next();

        String reverse1 = "";
        String reverse2 = "";
        for(int i=num1.length()-1; i>=0; i--){
            reverse1 = reverse1 + num1.charAt(i);
            reverse2 = reverse2 + num2.charAt(i);
        }

        if(Integer.parseInt(reverse1) > Integer.parseInt(reverse2)) System.out.println(reverse1);
        else System.out.println(reverse2);
    }
}
