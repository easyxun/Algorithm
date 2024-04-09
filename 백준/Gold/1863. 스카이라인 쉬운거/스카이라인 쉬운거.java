import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 좌표 개수

        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for (int i = 0; i < N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()); // x좌표
            int y = Integer.parseInt(st.nextToken()); // y좌표

            // 현재 높이가 이전 높이보다 낮은 경우
            while (!stack.isEmpty() && stack.peek() > y) {
                result++;
                stack.pop();
            }

            // 높이가 같은 경우
            if (!stack.isEmpty() && stack.peek() == y) {
                continue;
            }

            stack.push(y);
        }

        // 스택에 남아있는 높이 추가
        while (!stack.isEmpty()) {
            if (stack.peek() > 0) {
                result++;
            }
            stack.pop();
        }

        System.out.println(result);

    }
}
