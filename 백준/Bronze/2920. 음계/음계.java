import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[8];

        boolean ascending = true;
        boolean descending = true;

        // 입력
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // ascending 여부 확인
        for (int i = 0; i < 7; i++) {
            if (arr[i] != i + 1) {
                ascending = false;
            }
        }

        // descending 여부 확인
        for (int i = 0; i < 7; i++) {
            if (arr[i] != 8 - i) {
                descending = false;
            }
        }

        // 출력
        if (ascending)
            System.out.println("ascending");
        else if (descending)
            System.out.println("descending");
        else
            System.out.println("mixed");
    }
}
