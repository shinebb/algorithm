package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
* 둘째 줄부터 M개의 줄에 걸쳐서 공을 교환할 방법이 주어진다.
* 각 방법은 두 정수 i j로 이루어져 있으며, i번 바구니와 j번 바구니에 들어있는 공을 교환한다는 뜻이다. (1 ≤ i ≤ j ≤ N)
* 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다.
* */
public class step04_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(in.readLine(), " ");
        int leng = Integer.parseInt(st.nextToken()); //배열 크기
        int num = Integer.parseInt(st.nextToken());  //번호 주입 횟수

        int [] arr = new int[leng];
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }

        for(int i=0; i<num; i++){
            st = new StringTokenizer(in.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = arr[a-1];

            arr[a-1] = arr[b-1];
            arr[b-1] = c;
        }

        for(int i:arr){
            System.out.print(i + " ");
        }

        in.close();
    }
}
