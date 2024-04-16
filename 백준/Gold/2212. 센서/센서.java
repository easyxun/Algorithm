import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {// No2212 : 센서

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int[] arr = new int[N];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int temp = 0;


        int[] arr2 = new int[arr.length - 1];

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            arr2[i] = arr[i + 1] - arr[i];
            temp += arr2[i];
        }

        Arrays.sort(arr2);

        for (int i = 0; i < K - 1; i++) {
            if (i <= arr2.length - 1) {
                temp -= arr2[arr2.length - 1 - i];
            }
        }


        System.out.println(temp);

    }
}