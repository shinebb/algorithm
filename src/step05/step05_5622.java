package step05;

import java.util.Scanner;

/*
* 첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.
* 첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.
* (해당 방법으로 풀었지만 백준의 알고리즘에서는 switch문을 사용하여야 통과가 된다고 한다.)
* */
public class step05_5622 {
    public static void main(String[] args){
        String [] dial = {"","","ABC","DEF","GHI","JKL","MNO","PQRS","YUV","WXYZ"};
        //배열의 순서를 통해 다이얼 1,2,3 순서를 나타낼 수 있다.

        Scanner in = new Scanner(System.in);
        String alphabet = in.nextLine();
        int sum = 0;

        for(int j=0; j<alphabet.length(); j++){
            for(int i=0; i<dial.length; i++){
                if(dial[i].contains(alphabet.substring(j,j+1))){
                    sum += i+1; //순서는 i며, 걸리는 초수는 다이얼의 +1이 되기 때문에 해당 수식을 사용한다.
                    break;
                }
            }
        }

        System.out.println(sum);
    }
}
