import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 오름차순으로 정렬

        int result = 0;
        int sum = 0;
        for(int j = 0; j < N; j++){
            sum += arr[j]; // 0번부터 j번까지의 값을 누적
            result += sum; // 누적된 값을 결과에 누적
        }

        System.out.println(result);



    }
}
