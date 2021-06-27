import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
    백준 10869 문제 - 사칙연산 
    - 힌트 : 이 문제에서 나누기는 소수점을 신경쓰지 않는다.
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        System.out.println(add(a, b));
        System.out.println(minus(a, b));
        System.out.println(multiply(a, b));
        System.out.println(division(a, b));
        System.out.println(remainder(a, b));
    }

    private static int add(int a, int b) { return a + b; }
    
    private static int minus(int a, int b) { return a - b; }
    
    private static int multiply(int a, int b) { return a * b; }
    
    private static int division(int a, int b) { return a / b; }
    
    private static int remainder(int a, int b) { return a % b; }
}