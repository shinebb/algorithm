package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
* */
public class step04_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = new int[10];
        int result = 0; //결과값

        for(int i=0; i<arr.length; i++){
            int num = Integer.parseInt(in.readLine()) % 42; //42로 나눈 나머지 값
            arr[i] = num;
        }

        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            boolean check = false;
            for(int j=0; j<i; j++){
                if(num == arr[j]) check = true;
            }
            if(!check) result++;
        }

        System.out.println(result);

        in.close();
    }
}
