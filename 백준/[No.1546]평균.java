import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    백준 문제 1546번 - 평균
 */
class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double [] score = new double[n];
        
        double m = 0;
        for(int i = 0; i < n; i++){
            score[i] = Double.parseDouble(st.nextToken());
            if(m < score[i]) { m = score[i]; };
        }

        double sum = 0;
        for(int i = 0; i < n; i++){
            sum += score[i] / m * 100;
        }

        System.out.println(sum/n);

    }
}