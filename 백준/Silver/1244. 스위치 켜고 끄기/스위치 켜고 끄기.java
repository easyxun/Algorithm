import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1]; 

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine()); 
        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st2.nextToken()); 
            int num = Integer.parseInt(st2.nextToken()); 

            if (sex == 1) { 
                multiple(arr, num); 
            } else if (sex == 2) { 
                toggle(arr, num); 
                symmetry(arr, num); 
            }
        }

        print(arr); 
    }

    private static void multiple(int[] arr, int num) {
        for (int i = num; i < arr.length; i += num) {
            if (arr[i] == 0) arr[i] = 1; 
            else arr[i] = 0; 
        }
    }

    private static void toggle(int[] arr, int num) {
        if (arr[num] == 0) arr[num] = 1; 
        else arr[num] = 0; 
    }

    private static void symmetry(int[] arr, int num) {
        int left = num - 1; 
        int right = num + 1; 

        while (left >= 1 && right < arr.length && arr[left] == arr[right]) {
            if (arr[left] == 0) arr[left] = 1; 
            else arr[left] = 0; 
            if (arr[right] == 0) arr[right] = 1; 
            else arr[right] = 0; 
            left--; 
            right++; 
        }
    }

    private static void print(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            sb.append(arr[i]).append(" "); 
            if (i % 20 == 0 || i == arr.length - 1) {
                sb.append("\n"); 
            }
        }
        System.out.print(sb); 
    }
}
