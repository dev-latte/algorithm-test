import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    백준 문제 11654번 - 아스키 코드
*/
class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println((int)br.readLine().charAt(0));
    }
}