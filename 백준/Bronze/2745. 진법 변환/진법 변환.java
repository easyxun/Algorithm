import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken(); // B진법 수
        int a = Integer.parseInt(st.nextToken()); // B진법

        int num = 0; // 10진법으로 변환된 수를 저장할 변수

        // 문자열의 각 자리에 대해 진법 변환 수행
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);

            int temp; // 현재 자리의 숫자를 저장할 변수
            if (c >= 'A') {
                temp = c - 'A' + 10; // A ~ Z는 10부터 순서대로 저장되므로, 'A'를 빼고 10을 더함
            } else {
                temp = c - '0'; // 문자 '0'의 ASCII 코드 값인 48을 빼줌으로써 숫자를 얻음
            }

            num = num * a + temp; // 진법 변환 수행
        }

        // 결과 출력
        bw.write(String.valueOf(num));
        bw.flush();
        bw.close();
        br.close();
    }
}
