package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다.
* 둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
* 예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
* 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
* */
public class step04_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //입력받은 leng 크기로 배열 생성
        int leng = Integer.parseInt(in.readLine());
        int [] arr = new int[leng];

        st = new StringTokenizer(in.readLine());
        for(int i=0; i<leng; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }
        in.close();

        //최고점 찾기
        double max = 0;
        double sum = 0.0;

        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        //계산 및 출력
        for(int i=0; i<arr.length; i++){
            double score = arr[i] / max * 100;
            sum += score;

            System.out.println(score);
        }
        System.out.println(sum / leng);
    }
}
