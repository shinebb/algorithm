package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다.
* 둘째 줄에는 정수가 공백으로 구분되어져있다.
* 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
* 첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.
* */
public class step04_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int num = Integer.parseInt(in.readLine()); //첫번째 받는 값(배열크기)
        int arr[] = new int[num]; //배열생성

        st = new StringTokenizer(in.readLine(), " "); //배열 값 받기

        for(int i=0; i<num; i++){ //배열 값 넣기
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
        }

        int select_num = Integer.parseInt(in.readLine()); //몇개 있는지 알고 싶은 값
        int cnt = 0;

        in.close();

        for(int i:arr){
            if(i == select_num){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
