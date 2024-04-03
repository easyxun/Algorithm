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
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int i = 0; i < T; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st1.nextToken()); // 문서의 개수
            int index = Integer.parseInt(st1.nextToken()); // 궁금한 문서의 초기 위치

            // 문서의 중요도 입력받기
            String[] s = br.readLine().split(" ");
            int[] arr = new int[s.length];

            //문서의 중요도 배열 생성
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
            q1.offer(arr[i]); // 중요도순으로 정렬된 문서 큐
            q2.offer(i); // 인덱스 큐
        }

        int count = 1; // 몇 번째 인쇄인지 확인 할 변수

        while (!q1.isEmpty()) {
            int max = Collections.max(q1); // Collections.max(q1)은 중요도 큐에서 가장 큰 값을 반환 // N도 넣을 수 있지 않나?
            int doc = q1.poll(); // 현재 문서
            int docIndex = q2.poll(); // 현재 인덱스

            if (doc == max) { // 현재 문서가 가장 높은 중요도일 때
                if (docIndex == index) { // 현재 인덱스가 궁금한 문서의 초기 위치와 같으면?
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
