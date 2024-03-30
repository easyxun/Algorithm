import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        Map<Character, Integer> m = new HashMap<>(); // 알파벳 총 갯수
        for (char c : word.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0) + 1);
        }

        // 알파벳이 홀수 일 경우 판별
        int i = 0; // 알파벳 하나의 빈도수
        for (int frequency : m.values()) {
            if (frequency % 2 != 0) {
                i++;
            }
        }
        
        // i가 1이상이면 팰린드롬 만들 수 없음
        if (i > 1) {
            System.out.println("I'm Sorry Hansoo");
        } else {
            StringBuilder arr1 = new StringBuilder();

            // 팰린드롬 앞부분
            for (char c = 'A'; c <= 'Z'; c++) {
                int frequency = m.getOrDefault(c, 0);
                if (frequency > 0) {
                    for (int j = 0; j < frequency / 2; j++) {
                        arr1.append(c);
                    }
                }
            }

            // 팰린드롬 뒷부분
            StringBuilder arr2 = new StringBuilder(arr1).reverse();

            // i를 중앙에 삽입
            for (char c = 'A'; c <= 'Z'; c++) {
                int frequency = m.getOrDefault(c, 0);
                if (frequency % 2 != 0) {
                    arr1.append(c);
                    break;
                }
            }
            System.out.println(arr1.toString() + arr2.toString());
        }
    }
}