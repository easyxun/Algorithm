import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int t = 0; t < T; t++) {

            int K = Integer.parseInt(br.readLine()); // 소설을 구성하는 장의 수

            StringTokenizer st = new StringTokenizer(br.readLine());

            Queue<Long> queue = new PriorityQueue<>();

            for(int i = 0; i < K; i++)
                queue.offer(Long.parseLong(st.nextToken()));

            long sum = 0;

            // 큐에 원소가 1개 남을 때까지
            while (queue.size() > 1) {
                long first = queue.poll();
                long last = queue.poll();

                sum += first + last;
                queue.offer(first + last);
            }

            System.out.println(sum);
        }
    }
}
