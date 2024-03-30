import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄에서 끝말잇기 기록의 길이와 후보 단어의 개수를 입력 받음
        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken()); // 끝말잇기 기록의 길이
        int num = Integer.parseInt(st.nextToken()); // 후보 단어의 개수

        // 끝말잇기 기록을 저장할 HashSet
        HashSet<String> wordHashSet = new HashSet<>();
        // 끝말잇기 기록을 입력 받음
        for (int i = 0; i < length; i++) {
            wordHashSet.add(br.readLine());
        }

        // 후보 단어와 끝말잇기 기록을 비교하여 후보 단어를 저장할 ArrayList
        ArrayList<String> candidates = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String candidate = br.readLine();
            if (wordHashSet.contains(candidate)) {
                candidates.add(candidate);
            }
        }

        // 후보 단어를 사전순으로 정렬
        Collections.sort(candidates);

        // 결과 출력
        System.out.println(candidates.size()); // 후보 단어의 개수 출력
        for (String candidate : candidates) {
            System.out.println(candidate); // 후보 단어 출력
        }
    }
}
