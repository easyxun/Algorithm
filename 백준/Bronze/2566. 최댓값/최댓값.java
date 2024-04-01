import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력을 위한 2차원 배열 선언
        int[][] arr = new int[9][9];

        // 입력 받기
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 최댓값과 위치를 저장할 변수
        int max = 0;
        int maxI = 0;
        int maxJ = 0;

        // 최댓값과 해당 위치 찾기
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }

        // 결과 출력
        System.out.println(max);
        System.out.println((maxI+1)+ " " +(maxJ+1)); // 배열의 인덱스는 0부터 시작하므로 1을 더해 출력합니다.

        br.close();
    }
}
