import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    백준 문제 11720번 - 숫자의 합
*/
class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String [] input = br.readLine().split("");
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += Integer.parseInt(input[i]);
        }
        
        System.out.println(sum);
    }
}