package step05;

import java.util.Scanner;

/*
* 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서,
* 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
* 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
* */
public class step05_10809 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int[] result = new int[alphabet.length]; //결과값
        for(int i=0; i<result.length; i++){ //-1로 초기화
            result[i] = -1;
        }
        String word = in.nextLine();

        for(int i=0; i<alphabet.length; i++){
            for(int j=0; j<word.length(); j++){
                String one = word.substring(j, j+1);

                if(!one.equals(alphabet[i])) result[i] = -1;
                else{
                    if(result[i] == -1) {
                        result[i] = j;
                        break;
                    }
                }
            }
        }

        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
