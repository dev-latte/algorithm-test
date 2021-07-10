import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    백준 문제 2577번 - 숫자의 개수
 */
class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String [] sum = String.valueOf(Integer.parseInt(br.readLine()) 
                                        * Integer.parseInt(br.readLine()) 
                                        * Integer.parseInt(br.readLine())
                                        ).split("");
        int [] array = new int [10];

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < sum.length; j++){
                if(Integer.parseInt(sum[j]) == i){
                    array[i] = array[i] + 1;
                }
            }
            sb.append(array[i]).append("\n");
        }
        System.out.print(sb);
    }
}