package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
 * 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
 * */
public class step04_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[9]; //배열생성

        for(int i=0; i<arr.length; i++){ //배열 값 넣기
            int num = Integer.parseInt(in.readLine());
            arr[i] = num;
        }

        in.close();
        int max = arr[0]; //최대값
        int no = 1; //몇번째인지

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                no = i+1;
            }
        }

        System.out.println(max);
        System.out.println(no);
    }
}
