package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
* 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
* X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
* */
public class step04_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(in.readLine(), " ");
        int leng = Integer.parseInt(st.nextToken()); //배열 크기
        int num = Integer.parseInt(st.nextToken());  //기준값

        int [] arr = new int[leng];
        st = new StringTokenizer(in.readLine(), " ");

        for(int i=0; i<leng; i++){
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
        }

        for(int i:arr){
            if(i<num) System.out.print(i + " ");
        }

        in.close();
    }
}
