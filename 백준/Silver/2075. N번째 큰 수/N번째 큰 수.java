import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 내림차순 정렬

        int N = Integer.parseInt(br.readLine());

        // 우선순위 큐에 값을 넣기
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                pq.add(Integer.parseInt(st.nextToken()));
            }
        }

        // 결과를 저장할 배열 초기화
        int[] result = new int[N];

        // 결과 배열에 값을 채우기
        for (int k = 0; k < N; k++) {
            result[k] = pq.poll();
        }

        // 결과 출력
        System.out.println(result[N-1]);


        bw.flush();
        bw.close();
        br.close();
    }
}
