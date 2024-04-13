import java.util.*;
import java.io.*;


public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 1~10^6

        // 점화식 찾기
        // D[1] = 1
        // D[2] = 2
        // D[3] = D[2]+D[1]
        // D[4] = D[3]+D[2]
        // D[N] = D[N-1]+D[N-2]

        // 초기값 정의하기
        // D[0] = 0;
        // D[1] = 1;
        // D[2] = 2;

        int[] D = new int[N+2];

        D[1] = 1;
        D[2] = 2;

        for (int i = 3; i < N + 1; i++) {
            D[i] = (D[i - 1] + D[i-2]) % 10007;
        }
        System.out.println(D[N]);

    }

}