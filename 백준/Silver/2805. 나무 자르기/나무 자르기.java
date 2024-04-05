import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int L = Integer.parseInt(st1.nextToken()); // 집으로 가져가려고 하는 나무의 길이

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int max = 0;
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
            max = Math.max(arr[i], max);
        }


        int start = 0; // 자르는 나무의 높이는 0부터 시작
        int end = max; // 가장 큰 나무의 높이

        while(start <= end){
            int mid = (start + end) / 2; // 중간 높이

            long sum = 0; // 자른 나무의 길이 합

            for(int i = 0; i < N; i++){
                if(arr[i] > mid) // 현재 나무의 높이가 자르려는 높이보다 큰 경우
                    sum += (arr[i] - mid); // 높이만큼 자른 나무의 길이를 합산
            }

            if(sum >= L) // 필요한 길이보다 많이 잘린 경우
                start = mid + 1; // 자르는 나무의 높이를 증가시켜 더 많이 잘라보기
            else // 필요한 길이보다 적게 잘린 경우
                end = mid - 1; // 자르는 나무의 높이를 감소시켜 덜 잘라보기
        }

        System.out.println(end); // 최대 높이 출력
    }
}
