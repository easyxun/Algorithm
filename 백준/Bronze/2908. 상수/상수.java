import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 공백을 기준으로 토큰으로 분리

        StringBuilder sb1 = new StringBuilder(st.nextToken()); // 첫 번째 토큰을 StringBuilder에 저장
        int A = Integer.parseInt(sb1.reverse().toString()); // 문자열로 반환 > 역순 > (int)로 변환

        StringBuilder sb2 = new StringBuilder(st.nextToken()); // 두 번째 토큰을 StringBuilder에 저장
        int B = Integer.parseInt(sb2.reverse().toString()); // 문자열로 반환 > 역순 > (int)로 변환


        System.out.print(A > B ? A : B);

    }
}