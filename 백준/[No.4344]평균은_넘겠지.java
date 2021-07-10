import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    백준 문제 8958번 - OX퀴즈
 */
class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());

        for(int i = 0; i < c; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int [] student = new int [n];

            double sum = 0.0;
            for(int j = 0; j < n; j++){
                student[j] = Integer.parseInt(st.nextToken());
                sum += student[j];
            }

            double average = sum / n;
            double count = 0.0;
            for(int k = 0; k < n; k++){
                if(average < student[k]) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",count / n * 100);
        }
    }
}



// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// /*
//     백준 문제 11653번 - 소인수분해
//  */
// class Main {
//     public static void main(String [] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine());
    
//         while(true){
//             int number = n;
//             if (n / 2 != 1 && n % 2 == 0) { 
//                 n /= 2;
//                 number = 2;
//             } else if(n / 3 != 1 && n % 3 == 0) {
//                 System.out.println("3");
//                 n /= 3;
//                 number = 3;
//             } else if(n / 5 != 1 && n % 5 == 0){
//                 n /= 5;
//                 number = 5;
//             } else if(n / 7 != 1 && n % 7 == 0){
//                 n /= 7;
//                 number = 7;
//             }
            
//             if(number % n == 0 && n / 2 <= 1) { 
//                 System.out.println(number);
//                 break;
//             }

//             System.out.println(number);

//         }
//     }
// }


            // if(number == 1) { continue; }
            // if(number != 2 && number % 2 == 0) { continue; }
            // if(number != 3 && number % 3 == 0) { continue; }
            // if(number != 5 && number % 5 == 0) { continue; }
            // if(number != 7 && number % 7 == 0) { continue; }

// /*
//     - 백준 2231번 문제 -  분해합
//  */
// class Main {
//     public static void main(String [] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine());

//         int temp = 0;
//         for(int i = 0; i < n; i++){
//             if(n == sum(temp)) { break; }
//             temp++;
//         }
//         System.out.println(temp);
//     }

//     // 생성자가 없는 경우의 수?

//     private static int sum(int temp){
//         int number = temp;
//         int sum = 0;
//         while(0 < number){
//             sum += (number % 10);
//             number /= 10;
//         }
//         return temp + sum;
//     }
// }


/*
    - 백준 1011번 문제 - Fly me to the Alpha Centauri 
 */
// class Main {
//     public static void main(String [] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int t = Integer.parseInt(br.readLine());

//         for(int i = 0; i < t; i++){
//             StringTokenizer st = new StringTokenizer(br.readLine());
//             int x = Integer.parseInt(st.nextToken());
//             int y = Integer.parseInt(st.nextToken());

//             int start = x + 1;
//             int end = y - 1;

//             int spaceShip = start;

//             // if(end - spaceShip){}
//             System.out.println((end - start - 1) + 2);
//         }
//     }
// }








