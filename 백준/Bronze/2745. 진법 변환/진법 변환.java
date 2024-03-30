import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken(); // n진법 갯수

        int a = Integer.parseInt(st.nextToken()); // n진법
        int num = 0; // 10진법

        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            int temp; // i번째 수를 10진법으로 변환하여 저장할 변수
            if (c >= 'A') {
                temp = c - 55; // A ~ Z는 10부터 순서대로 저장 -> -65('A')+10
            } else {
                temp = c - 48; // 0의 아스키코드 48 -> -48
            }

            num = num * a + temp;
        }

        bw.write(String.valueOf(num));
        bw.flush();
        bw.close();
        br.close();

    }
}
