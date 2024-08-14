package step03;

import java.io.*;
import java.util.StringTokenizer;

/*
* 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
* 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
* 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
* */
public class step03_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int num = Integer.parseInt(in.readLine());

        for(int i=0; i<num; i++){
            st = new StringTokenizer(in.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            out.write("Case #" + (i+1) + ": " + a + " + " + b + " = " + (a+b) + "\n");
        }

        in.close();

        out.flush();
        out.close();
    }
}