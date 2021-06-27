import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
    백준 2588 문제 - 곱셈 
    - 힌트 : 사람이 행하는 곱셈의 연산은 뒷자리부터 시작된다.
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();

        int [] digits = {100, 10, 1};

        int sum = 0;        
        for(int i = 3; 0 < i; i--) {
            int result = 0;
            result = (i == 3) ? Integer.parseInt(b.substring(i-1)) : Integer.parseInt(b.substring(i-1, i));
            System.out.println(result * a);
            sum = sum + ((result * digits[i-1]) * a);
        }
        System.out.println(sum); 
    }
}