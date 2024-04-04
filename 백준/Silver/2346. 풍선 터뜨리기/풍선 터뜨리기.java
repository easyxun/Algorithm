import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 풍선 개수

        String[] s = br.readLine().split(" ");
        int[] arr = new int[s.length];

        // 풍선 안의 숫자메모 배열 생성
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        Deque<Integer> qMemo = new ArrayDeque<>(); // 숫자메모
        Deque<Integer> qIndex = new ArrayDeque<>(); // 인덱스

        for (int i = 0; i < N; i++) {
            qMemo.offer(arr[i]); // 3 2 1 -3 -1
            qIndex.offer(i + 1); // 1 2 3 4 5
        }

        List<Integer> result = new ArrayList<>(); //


        int index = 0;
        while (!qMemo.isEmpty()) {

            result.add(qIndex.pollFirst()); // 1번 풍선 인덱스를 결과에 추가
            int temp = qMemo.pollFirst(); // 현재 풍선에서 나온 값

//            int nextIndex = index + temp; // 다음으로 이동할 풍선 번호

            if (temp > 0) {
                // 오른쪽으로 이동
                for (int i = 0; i < temp - 1; i++) {
                    if (!qMemo.isEmpty()) {
                        qMemo.offerLast(qMemo.pollFirst());
                        qIndex.offerLast(qIndex.pollFirst());
                    }
                }
            } else {
                // 왼쪽으로 이동
                for (int i = 0; i < Math.abs(temp); i++) {
                    if (!qMemo.isEmpty()) {
                        qMemo.offerFirst(qMemo.pollLast());
                        qIndex.offerFirst(qIndex.pollLast());
                    }
                }
            }

        }

        // 결과 출력
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
