import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
    백준 문제 11021번- A+B - 7
 */
class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for(int i = 1; i < t + 1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append("Case #")
                .append(i)
                .append(": ")
                .append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))
                .append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}