import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
    백준 1008번 문제 - A/B 
    - 조건 : 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답 > 최소 9자리 이상 출력
    - 힌트 : 나누기는 소수로 나누어지는 경우가 있으므로 실수 타입으로 접근해야한다.
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        
        System.out.println(a / b);
    }
}