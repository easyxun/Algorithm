import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력된 문자열을 대문자로 변환하여 저장
        String str = br.readLine().toUpperCase();
        // 문자열을 문자 배열로 저장
        char[] arr = str.toCharArray();

        // 출현 빈도를 저장할 HashMap
        HashMap<Character, Integer> map = new HashMap<>();
        // 중복 문자를 제거하기 위한 HashSet
        HashSet<Character> set = new HashSet<>();

        // 문자 배열을 순회하면서 출현 빈도를 계산하고 중복 문자를 제거
        for (char c : arr) {
            if (set.contains(c)) { // HashSet에 문자가 이미 있는 경우
                map.put(c, map.get(c) + 1); // 해당 문자의 빈도를 1 증가
            } else { // HashSet에 문자가 없는 경우
                map.put(c, 1); // 해당 문자의 빈도를 1로 초기화
                set.add(c); // HashSet에 문자 추가
            }
        }

        // 가장 많이 출현한 알파벳과 그 빈도를 저장할 변수 초기화
        char maxChar = ' ';
        int max = 0;

        // HashMap을 순회하면서 가장 많이 출현한 알파벳과 그 빈도를 찾음
        for (char c : map.keySet()) {
            int i = map.get(c); // 현재 문자의 출현 빈도
            if (i > max) { // 최대 출현 빈도를 갱신할 경우
                maxChar = c; // 가장 많이 출현한 알파벳을 업데이트
                max = i; // 최대 출현 빈도를 업데이트
            } else if (i == max) { // 최대 출현 빈도와 동일한 경우
                maxChar = '?'; // 다수의 알파벳이 최대 출현 빈도를 가지고 있으므로 '?'로 설정
            }
        }

        // 결과를 출력 스트림에 쓰기
        bw.write(maxChar);
        // 출력 버퍼 비우기
        bw.flush();
        // 출력 스트림 닫기
        bw.close();
    }
}
