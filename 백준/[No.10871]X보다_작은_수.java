import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
    백준 문제 10871번 - X보다 작은 수
 */
class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        StringTokenizer listTokenizer = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            int number = Integer.parseInt(listTokenizer.nextToken());
            if(number < x) {
                sb.append(number).append(" ");
            }
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
