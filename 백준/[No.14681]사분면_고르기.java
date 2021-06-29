import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
    - 백준 14681번 문제 - 사분면 고르기 
 */
class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        System.out.println(quadrant(x, y));
    }

    private static int quadrant(int x, int y){
        if (0 < x && 0 < y) return 1;
        if (0 < x && y < 0) return 4;
        if (x < 0 && 0 < y) return 2;
        return 3;
    }

}