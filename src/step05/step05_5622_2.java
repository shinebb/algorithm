package step05;

import java.util.Scanner;

/*
* 첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.
* 첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.
* */
public class step05_5622_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String alphabet = in.nextLine();
        int sum = 0;

        for(int i=0; i<alphabet.length(); i++){

            switch(alphabet.charAt(i)) {
                case 'A' : case 'B' : case 'C':
                    sum += 3;
                    break;
                case 'D' : case 'E' : case 'F':
                    sum += 4;
                    break;
                case 'G' : case 'H' : case 'I':
                    sum += 5;
                    break;
                case 'J' : case 'K' : case 'L':
                    sum += 6;
                    break;
                case 'M' : case 'N' : case 'O':
                    sum += 7;
                    break;
                case 'P' : case 'Q' : case 'R': case 'S':
                    sum += 8;
                    break;
                case 'T' : case 'U' : case 'V':
                    sum += 9;
                    break;
                case 'W' : case 'X' : case 'Y': case 'Z':
                    sum += 10;
                    break;
            }

        }

        System.out.println(sum);
    }
}
