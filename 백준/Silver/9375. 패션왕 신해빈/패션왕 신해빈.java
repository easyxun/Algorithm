import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트케이스 개수

        for(int i = 0; i<T; i++){

            HashMap<String, Integer> hm = new HashMap<>(); // < 의상종류, 종류 별 의상 개수 >
            int N = Integer.parseInt(br.readLine()); // 의상 개수

            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                st.nextToken(); // 의상
                String kind = st.nextToken(); // 의상 종류

                // map키값 중복 확인
                if (hm.containsKey(kind)) {
                    hm.put(kind, hm.get(kind) + 1); // value + 1
                } else {
                    hm.put(kind, 1); // value set 1
                }
            }

            int result = 1;
            for (int n : hm.values()) {
                result *= (n + 1);
            }

            System.out.println(result - 1);

        }

    }

}