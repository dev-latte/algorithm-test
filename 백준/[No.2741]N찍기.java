import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    백준 문제 2741번- N찍기
 */
class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        
        for(int i = 1; i < n + 1; i++){
            sb.append(i).append("\n");
        }

        System.out.print(sb.toString());
    }
}
