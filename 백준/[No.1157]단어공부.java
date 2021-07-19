import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    백준 문제 1157번 - 단어공부
*/
class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] letters = new int[26];
        String word = br.readLine();

        for(int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            if(letter <= 'Z') {
                letters[letter - 'A']++;
                continue;
            }
            letters[letter - 'a']++;
        }

        int max = 0;
        char result = '?';
        for(int i = 0; i < letters.length; i++){
            if(max < letters[i]){
                max = letters[i];
                result = (char)(i + 'A');
            } else if (max == letters[i]){
                result = '?';
            }
        }

        System.out.println(result);
    }
}