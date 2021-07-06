import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    - 백준 1110번 문제 -  더하기 사이클
 */
class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int temp = n;
        int count = 0;
        while(true) {
            int a = temp / 10;
            int b = temp % 10;

            temp = (b * 10) + ((a + b) % 10);
            count++;

            if(n == temp){ break; }
        }

        System.out.println(count);
    }
}
