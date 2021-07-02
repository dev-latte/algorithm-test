import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    백준 문제 8393번 - 합
 */
class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int remain = (n % 2 != 0) ? (n + 1) / 2 : 0;
        
        System.out.print((n + 1) * (n / 2) + remain);
    }
}