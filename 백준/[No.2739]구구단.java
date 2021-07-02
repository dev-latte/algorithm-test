import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    백준 문제 2739번 - 구구단
 */
class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < 10; i++){
            sb.append(n)
                .append(" * ")
                .append(i)
                .append(" = ")
                .append(n * i)
                .append("\n");
        }
        
        System.out.println(sb);
    }
}