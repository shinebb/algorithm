package step02;

import java.util.Scanner;

/*
* 첫째 줄에는 현재 시각이 나온다. 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다.
* 두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.
* 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
* */
public class step02_2525 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int hour = in.nextInt();
        int min = in.nextInt();
        int time = in.nextInt();

        if((min+time)>=60){
            hour = hour + ((min+time)/60);
            if(hour>23){
                hour = hour - 24;
            }

            min = (min+time)%60;
        }else{
            min = min+time;
        }

        System.out.println(hour + " " + min);
    }
}
