import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        char[][] arr = new char[n][n];
        // 보드 입력
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        // 가로로 누울 수 있는 자리 찾기
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            boolean b1 = false;
            for (int j = 0; j < n-1; j++) {
                if (arr[i][j] == '.' && arr[i][j+1] == '.') {
                    b1 = true;
                } else {
                    if (b1) {
                        count1++;
                        b1 = false;
                    }
                }
            }
            if (b1) count1++;
        }

        // 세로로 누울 수 있는 자리 찾기
        int count2 = 0;
        for (int j = 0; j < n; j++) {
            boolean b2 = false;
            for (int i = 0; i < n-1; i++) {
                if (arr[i][j] == '.' && arr[i+1][j] == '.') {
                    b2 = true;
                } else {
                    if (b2) {
                        count2++;
                        b2 = false;
                    }
                }
            }
            if (b2) count2++;
        }

        System.out.println(count1 + " " + count2);
    }
}
