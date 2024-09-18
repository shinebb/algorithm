package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step07_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        char[][] array = new char[5][15];

        for(int i=0; i<5; i++){
            st = new StringTokenizer(in.readLine());
            String word = st.nextToken().trim();

            for(int j=0; j<word.length(); j++){
                array[i][j] = word.charAt(j);
            }
        }
        for(int j=0; j<15; j++){
            for(int i=0; i<5; i++){
                if(array[i][j] != 0)
                System.out.print(array[i][j]);
            }
        }

    }
}
