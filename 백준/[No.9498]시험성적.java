import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
    - 백준 9498번 문제 - 시험 성적 
 */
class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int grade = Integer.parseInt(br.readLine());

        System.out.println(grade(grade));
    }

    private static String grade(int score){
        if (score < 60) return "F";
        if (score < 70) return "D";
        if (score < 80) return "C";
        if (score < 90) return "B";
        return "A";
    }
}