import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
/*
    - 백준 2884번 문제 - 알람 시계 
 */
class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println(setTime(h, m));;
    }

    private static String setTime(int h, int m){
        StringBuilder sb = new StringBuilder();
        int ealryM = 45;

        if(m < ealryM){ 
            h -= 1;
            m += 60;
        }
        
        m -= ealryM;

        if(h < 0){ h += 24; }

        sb.append(h).append(" ").append(m);

        return sb.toString();
    }

}