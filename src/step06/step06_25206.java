package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step06_25206 {

    static double sum = 0; //학점 총합
    static double sum_score = 0; //전공과목별 합(학점+과목평점)
    static double result = 0; //최종 전공평점


    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int num = 20; //과목 갯수

        for(int i=0; i<num; i++){
            st = new StringTokenizer(in.readLine(), " ");
            String subject = st.nextToken();
            double grade = Double.parseDouble(st.nextToken());
            String grade_str = st.nextToken();

            grade_calcul(grade, grade_str);

        }

        result = sum_score / sum;
        System.out.println(result);
    }

    public static void grade_calcul(double grade, String grade_str){
        double score = 0; //과목평점

        switch (grade_str){
            case "A+": score = 4.5; break;
            case "A0": score = 4.0; break;
            case "B+": score = 3.5; break;
            case "B0": score = 3.0; break;
            case "C+": score = 2.5; break;
            case "C0": score = 2.0; break;
            case "D+": score = 1.5; break;
            case "D0": score = 1.0; break;
            case "F": score = 0.0; break;
        }

        if(!grade_str.equals("P")){
            sum += grade;
            sum_score += grade*score;
        }
    }
}
