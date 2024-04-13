import java.util.*;
import java.io.*;


public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 1~10^6

        // 점화식 찾기
        // D[12] = min(D[4]+1, D[6]+1, D[11]+1)
        // D[i] = min(D[i/3]+1, D[i/2]+1, D[i-1]+1)

        // 초기값 정의하기
        // D[1] = 0;

        int[] D = new int[N + 1];

        D[1] = 0;

        for (int i = 2; i < N + 1; i++) {
            D[i] = D[i - 1] + 1;
            if (i % 2 == 0) D[i] = Math.min(D[i], D[i / 2] + 1);
            if (i % 3 == 0) D[i] = Math.min(D[i], D[i / 3] + 1);
        }
        System.out.println(D[N]);

    }

}