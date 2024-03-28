import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().toUpperCase(); // 입력된 문자를 대문자로 변환하여 저장
        char[] arr = str.toCharArray(); // 문자 배열로 저장

        HashMap<Character, Integer> map = new HashMap<>(); // 출현빈도 저장
        HashSet<Character> set = new HashSet<>(); // 중복 문자 제거

        for (char c : arr) {
            if (set.contains(c)) { // Hashset에 문자가 있으면
                map.put(c, map.get(c) + 1); // (문자,출현빈도 +1)
            } else {
                map.put(c, 1); // 문자가 없으면 초기화
                set.add(c); // 중복문자 확인, Hashset에 추가
            }
        }

        char maxChar = ' '; // 가장 많이 출현한 알파벳을 저장할 변수 초기화
        int max = 0; // 알파벳의 최대 출현 빈도를 저장할 변수 초기화

        for (char c : map.keySet()) {
            int value = map.get(c);
            if (value > max) {
                maxChar = c;
                max = value;
            } else if (value == max) {
                maxChar = '?';
            }
        }

        bw.write(maxChar); // 결과 출력
        bw.flush(); // 출력 버퍼 비우기
        bw.close(); // 출력 스트림 닫기
    }
}