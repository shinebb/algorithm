package step03;

import java.io.*;
import java.util.StringTokenizer;

/*
* 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
* */
public class step03_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(in.readLine());

        for(int i=0; i<num; i++){
            for(int j=0; j<=i; j++){
                out.write("*");
            }
            out.write("\n");
        }
        in.close();

        out.flush();
        out.close();
    }
}