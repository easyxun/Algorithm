import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];  // 회의실 배열, 각 요소는 시작 시간과 종료 시간을 포함합니다

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startTime = Integer.parseInt(st.nextToken());
            int endTime = Integer.parseInt(st.nextToken());
            arr[i][0] = startTime;  // 시작 시간
            arr[i][1] = endTime;    // 종료 시간
        }

        // gpt가 해줌 종료시간 기준 오름차순 정렬 or 종료시간이 다르면 시작시간을 비교하여 정렬
        Arrays.sort(arr, (a, b) -> {
            if (a[1] == b[1]) {
                // 종료 시간이 같으면 시작 시간을 비교하여 정렬
                return Integer.compare(a[0], b[0]);
            } else {
                // 종료 시간이 다르면 종료 시간을 비교하여 정렬
                return Integer.compare(a[1], b[1]);
            }
        });


        int count = 0;
        int time = 0;  //현재 시간
        for(int i = 0; i < N; i++) {

            // 직전 종료시간이 다음 회의 시작 시간보다 작거나 같다면 갱신 
            if(time <= arr[i][0]) {
                time = arr[i][1];
                count++;
            }
        }

        System.out.println(count);
    }

}