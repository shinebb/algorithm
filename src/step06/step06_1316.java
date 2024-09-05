package step06;

import java.util.Scanner;

/*
* 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
* 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
* 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
*  */
public class step06_1316 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int result = 0;

        for(int i=0; i<num; i++){
            String word = in.next();

            if(checkStr(word)){
                result++;
            }
        }

        System.out.println(result);
    }

    static boolean checkStr(String str){
        boolean[] checkAlpha = new boolean[26]; //알파벳 26개, boolean 타입은 최초선언시 값이 지정되지 않으면 false로 저장된다.
        int prev = -1; //이전 문자의 인덱스값

        for(int i=0; i<str.length(); i++){
            int now = str.charAt(i); //현재 선택된 문자 (정수형으로 받기때문에 아스키코드값으로 저장된다.)

            if(prev != now){ //이전 문자와 다르다면(연속된 문자인지 확인)
                if (checkAlpha[now-97] == false) { //false이면 초기값이기때문에 처음 나온 문자이다.
                    checkAlpha[now-97] = true; //한번 나왔었으니 true값으로 바꿔줌
                    prev = now; //이전문자로 현재 인덱스값 저장

                }else{
                    return false;
                }
            }else{ //이전 문자와 같다면(연속된 문자)
                continue;
            }
        }

        //중간에 return true가 되지않는다면 유효성 검사 완료!
        return true;
    }
}
