import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 배열 크기
        int s = Integer.parseInt(st.nextToken()); // 부분 수열의 합

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken()); // 수열
        }

        int count = dfs(arr, 0, 0, s);

        // 부분 수열의 합이 0이면 count에서 1을 빼고 출력
        if (s == 0) {
            System.out.println(count - 1);
        } else {
            System.out.println(count);
        }
    }

    static int dfs(int[] arr, int index, int sum, int s){

        if(index == arr.length) {
            // 현재까지의 합이 부분수열의 합(답)과 같으면 경우의 수 1 반환, 아니면 0 반환
            return sum == s ? 1 : 0;
        }

        // 현재 인덱스를 포함하는 경우와 포함하지 않는 경우에 대해 재귀 호출하여 결과를 합산
        int in = dfs(arr, index+1, sum + arr[index], s);
        int ex = dfs(arr, index+1, sum, s);

        // 현재 인덱스를 포함하는 경우와 포함하지 않는 경우의 결과를 합산하여 반환
        return in + ex;
    }
}
