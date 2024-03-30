import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        // 각 알파벳의 빈도수를 저장하는 HashMap
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // 각 알파벳의 빈도수 계산
        for (char ch : word.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // 홀수 빈도수를 가진 알파벳의 개수 계산
        int oddCount = 0;
        for (int count : frequencyMap.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        // 홀수 빈도수를 가진 알파벳이 1개를 초과하면 팰린드롬을 만들 수 없음
        if (oddCount > 1) {
            System.out.println("I'm Sorry Hansoo");
        } else {
            // 팰린드롬을 만들기 위한 문자열 생성
            StringBuilder palindrome = new StringBuilder();

            // 팰린드롬의 앞부분 구성
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                int count = frequencyMap.getOrDefault(ch, 0);
                if (count > 0) {
                    // 앞쪽에 절반을 삽입
                    for (int i = 0; i < count / 2; i++) {
                        palindrome.append(ch);
                    }
                }
            }

            // 뒷부분 구성 (앞부분을 뒤집어서 사용)
            StringBuilder reversePalindrome = new StringBuilder(palindrome).reverse();

            // 홀수 빈도수를 가진 알파벳이 있는 경우 중앙에 삽입
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                int count = frequencyMap.getOrDefault(ch, 0);
                if (count % 2 != 0) {
                    palindrome.append(ch);
                    break;
                }
            }

            // 결과 출력
            System.out.println(palindrome.toString() + reversePalindrome.toString());
        }
    }
}
