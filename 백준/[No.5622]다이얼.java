import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    백준 문제 5622번 - 다이얼
*/
class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int time = 0;
        for(int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);

            if(letter <= 'C') time += 3;
            else if(letter <= 'F') time += 4;
            else if(letter <= 'I') time += 5;
            else if(letter <= 'L') time += 6;
            else if(letter <= 'O') time += 7;
            else if(letter <= 'S') time += 8;
            else if(letter <= 'V') time += 9;
            else if(letter <= 'Z') time += 10;
        }
        System.out.println(time);
    }
}