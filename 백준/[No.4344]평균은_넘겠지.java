import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    백준 문제 4344번 - 평균은 넘겠지
 */
class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());

        for(int i = 0; i < c; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int [] student = new int [n];

            double sum = 0.0;
            for(int j = 0; j < n; j++){
                student[j] = Integer.parseInt(st.nextToken());
                sum += student[j];
            }

            double average = sum / n;
            double count = 0.0;
            for(int k = 0; k < n; k++){
                if(average < student[k]) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",count / n * 100);
        }
    }
}