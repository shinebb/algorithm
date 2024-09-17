package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step07_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] array_a = new int[n][m];
        int[][] array_b = new int[n][m];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(in.readLine(), " ");
            for(int j=0; j<m; j++){
                array_a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<n; i++){
            st = new StringTokenizer(in.readLine(), " ");
            for(int j=0; j<m; j++){
                array_b[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(array_a[i][j] + array_b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
