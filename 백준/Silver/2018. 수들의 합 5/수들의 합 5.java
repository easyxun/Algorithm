import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i <= N; i++) {
            int sum = 0;
            for (int j = i; j <= N; j++) {
                sum += j;
                if (sum == N) {
                    count++;
                    break;
                } else if (sum > N) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
