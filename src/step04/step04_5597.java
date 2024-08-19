package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
* 둘째 줄부터 M개의 줄에 걸쳐서 공을 넣는 방법이 주어진다.
* 각 방법은 세 정수 i j k로 이루어져 있으며, i번 바구니부터 j번 바구니까지에 k번 번호가 적혀져 있는 공을 넣는다는 뜻이다.
* 예를 들어, 2 5 6은 2번 바구니부터 5번 바구니까지에 6번 공을 넣는다는 뜻이다. (1 ≤ i ≤ j ≤ N, 1 ≤ k ≤ N)
* 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다. 공이 들어있지 않은 바구니는 0을 출력한다.
* */
public class step04_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = new int[31];

        for(int i=0; i<28; i++){
            int num = Integer.parseInt(in.readLine());
            arr[num] = 1;
        }

        for(int i=1; i<arr.length; i++){
            if(arr[i] != 1) System.out.println(i);
        }

        in.close();
    }
}
