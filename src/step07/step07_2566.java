package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step07_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] array = new int[9][9];
        int max = 0;
        int n = 0;
        int m = 0;

        for(int i=0; i<9; i++){
            st = new StringTokenizer(in.readLine(), " ");
            for(int j=0; j<9; j++){
                array[i][j] = Integer.parseInt(st.nextToken());

                if(array[i][j] > max){
                    //System.out.println("실행 : " +i + j + " : " +array[i][j]);
                    max = array[i][j];
                    n = i;
                    m = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((n+1) + " " + (m+1));

    }
}
