package step03;

import java.io.*;
import java.util.StringTokenizer;

/*
* 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
* 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
* */
public class step03_15552 {
    public static void main(String[] args) throws IOException {
        //BufferedReader는 개행문자만 경계로 인식하고 입력받은 데이터가 String으로 고정된다.
        //따라서 데이터를 가공해야하는 경우가 많지만, Scanner보다 속도가 빠르다.
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(in.readLine());

        StringTokenizer st;

        for(int i=0; i<num; i++){
            //개행문자 말고 공백단위로 데이터를 가공하고자 할 때 StringTokenizer를 사용한다.
            st = new StringTokenizer(in.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            out.write(a+b + "\n");
            //out.flush();
        }
        in.close();

        out.flush(); //남아있는 데이터 모두 출력(비움)
        out.close(); //BufferedWriter의 경우 버퍼를 잡아 놓기 때문이 반드시 사용한 후에 close()를 해주어야한다.
    }
}
