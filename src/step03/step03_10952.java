package step03;

import java.io.*;
import java.util.StringTokenizer;

/*
* 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
* 입력의 마지막에는 0 두 개가 들어온다. 0 두 개가 들어오면 종료된다.
* */
public class step03_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(in.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(!(a==0) && !(b==0)){
                out.write(a+b + "\n");
            }else{
                break;
            }
        }
        in.close();

        out.flush();
        out.close();
    }
}