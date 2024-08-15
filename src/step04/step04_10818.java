package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
* 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
* */
public class step04_10818 {
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

        in.close();

        int min = arr[0]; //최소값
        int max = arr[0]; //최대값

        for(int i=0; i<num; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(min + " " + max);
    }
}
