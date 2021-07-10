import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
    백준 문제 2562번 - 최댓값
 */
class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = 9;

        int max = 0;
        int index = 0;
        for(int i = 0; i < t; i++){
            int score = Integer.parseInt(br.readLine());
            if (max < score) { 
                max = score; 
                index = i + 1;
            }
        }
        sb.append(max).append("\n").append(index);
        System.out.println(sb);
    }
}