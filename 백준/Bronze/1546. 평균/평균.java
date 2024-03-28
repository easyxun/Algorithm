import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // count = 점수 갯수
        int count = Integer.parseInt(br.readLine());
        double[] scores = new double[count];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < count; i++) {
            scores[i] = Double.parseDouble(st.nextToken()); // 입력 배열에 저장
        }

        Arrays.sort(scores); // 오름차순 정렬
        double maxScore = scores[count - 1];

        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += ((scores[i] / maxScore) * 100); // 최댓값으로 나눔
        }

        System.out.print(sum / count);
    }
}
