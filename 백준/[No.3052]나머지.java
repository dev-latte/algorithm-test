import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
    백준 문제 2562번 - 최댓값
 */
class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 10;

        int [] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = Integer.parseInt(br.readLine()) % 42;
        }

        Arrays.sort(array);

        int temp = 0;
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(i == 0 || array[i] != temp) { 
                temp = array[i];
                count++;
                continue;
            }
        }
        System.out.println(count);
    }
}