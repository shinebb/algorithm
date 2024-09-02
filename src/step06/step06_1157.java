package step06;

import java.util.Scanner;

/*
* 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
*  */
public class step06_1157 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String word = in.nextLine().toUpperCase().trim();
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int[] num = new int[alphabet.length];

        for(int i=0; i<word.length(); i++){
            for(int j=0; j< alphabet.length; j++){
                if(word.charAt(i) == alphabet[j]){
                    num[j] += 1;
                    break;
                }
            }
        }

        int max = 0;
        int over = 0;
        char result = '?';

        for(int i=0; i<num.length; i++){
            if(max < num[i]) {
                max = num[i];
                result = alphabet[i];

            }
        }
        for(int i=0; i<num.length; i++){
            if(max == num[i]){
                over += 1;
            }
            if(over > 1){
                result = '?';
                break;
            }
        }

        System.out.println(result);

    }
}
