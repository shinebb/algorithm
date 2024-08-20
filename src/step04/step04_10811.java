package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
* 둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다.
* 방법은 i j로 나타내고, 왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 역순으로 만든다는 뜻이다. (1 ≤ i ≤ j ≤ N)
* */
public class step04_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(in.readLine());
        int leng = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        int [] arr = new int[leng]; //입력받은 leng 크기로 배열 생성 및 값 넣어주기
        for(int i=0; i<leng; i++){
            arr[i] = i+1;
        }

        for(int i=0; i<num; i++){
            st = new StringTokenizer(in.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            while(from<to){
                for(int j=from; j<to; j++){
                    int box = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = box;
                }
                to--;
            }
        }

        //출력
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        in.close();
    }
}
