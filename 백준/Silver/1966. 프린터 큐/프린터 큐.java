import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st1.nextToken());
            int index = Integer.parseInt(st1.nextToken());

            String[] s = br.readLine().split(" ");
            int[] arr = new int[s.length];

            for (int j = 0; j < s.length; j++) {
                arr[j] = Integer.parseInt(s[j]);
            }

            solution(N, index, arr);
        }
    }

    private static void solution(int N, int index, int[] arr) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            q1.offer(arr[i]);
            q2.offer(i);
        }
        int count = 1;

        while (!q1.isEmpty()) {
            int max = Collections.max(q1);
            int doc = q1.poll();
            int docIndex = q2.poll();

            if (doc == max) {
                if (docIndex == index) {
                    System.out.println(count);
                    break;
                }
                count++;
            } else {
                q1.offer(doc);
                q2.offer(docIndex);
            }
        }
    }
}
