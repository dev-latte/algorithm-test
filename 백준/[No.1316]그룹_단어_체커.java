import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/*
    백준 문제 1316번 - 그룹 단어 체커
*/
class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet <Character> hashSet = new HashSet<>();
        
        int count = 0;
        for(int i = 0; i < n; i++){
            boolean isGroupWord = true;
            String word = br.readLine();
            for(int j = 0; j < word.length(); j++){
                char character = word.charAt(j);

                if(j == 0) {
                    hashSet.add(character);
                    continue;
                }

                if(character == word.charAt(j-1)) {
                    continue;
                }

                if(!hashSet.contains(character)){
                    hashSet.add(character);
                    continue;
                }

                isGroupWord = false;
            }

            hashSet.clear();
            if(isGroupWord) count++;
        }

        System.out.println(count);
    }
}