import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
    - 백준 2753번 문제 - 윤년 
 */
class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int years = Integer.parseInt(br.readLine());

        int result = (years % 4 == 0 && years % 100 != 0) || years % 400 == 0 ? 1 : 0;

        System.out.println(result);
    }
}