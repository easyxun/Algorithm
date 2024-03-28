import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine()); // 처음 입력으로 받은 과일의 개수

        HashMap<String, Integer> map = new HashMap<>();

        // 각 과일과 개수를 HashMap에 저장
        for (int i = 0; i < count; i++) {
            String[] s = br.readLine().split(" ");

            // readLine 기준 s[0]은 과일이름 s[1]은 과일갯수 저장
            String fruit = s[0];
            int value = Integer.parseInt(s[1]);

            if (map.containsKey(fruit)) { // 이미 저장된 과일인지 확인
                int currentValue = map.get(fruit);
                map.put(fruit, currentValue + value);
            } else { // 처음 저장하는 과일이면 그대로 저장
                map.put(fruit, value);
            }
        }

        if (map.containsValue(5)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
