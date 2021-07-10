import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    백준 문제 10818번 - 최소, 최대
 */
class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = -1000000;
        int min = 1000000;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            if(max < num){ max = num; }
            if(num < min){ min = num; }
        }
        
        sb.append(min).append(" ").append(max);        
        System.out.println(sb);
    }
}