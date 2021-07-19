import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    백준 문제 10809번 - 알파벳 찾기
*/
class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        char [] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < alphabet.length; i++) {
            sb.append(word.indexOf(alphabet[i])).append(" ");
        }
        
        System.out.println(sb);
    }
}