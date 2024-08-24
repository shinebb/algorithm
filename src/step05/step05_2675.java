package step05;

import java.util.Scanner;

/*
* 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
* 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다.
* */
public class step05_2675 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int [] repeat = new int[num];
        String [] word = new String[num];

        for(int i=0; i<num; i++){
            repeat[i] = in.nextInt();
            word[i] = in.next();
        }

        for(int i=0; i<num; i++){
            int a = repeat[i];

            for(int k=0; k<word[i].length(); k++){
                for(int j=0; j<a; j++){
                    System.out.print(word[i].charAt(k));
                }
            }
            System.out.println("");
        }
    }
}
