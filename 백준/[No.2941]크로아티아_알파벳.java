import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    백준 문제 2941번 - 크로아티아 알파벳
*/
class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        word = word.replace("c=", "0")
                    .replace("c-", "0")
                    .replace("dz=", "0")
                    .replace("d-", "0")
                    .replace("lj", "0")
                    .replace("nj", "0")
                    .replace("s=", "0")
                    .replace("z=", "0");

        System.out.println(word.length());
    }
}