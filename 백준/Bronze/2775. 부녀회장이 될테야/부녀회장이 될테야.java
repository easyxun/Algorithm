import java.util.*;
import java.io.*;

public class Main {

    static int[][] apt = new int[15][15];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트케이스 개수


        for (int i = 0; i < T; i++) {
            int floor = Integer.parseInt(br.readLine()); // 층
            int room = Integer.parseInt(br.readLine()); // 호

            System.out.println(solution(floor, room));

        }


    }

    private static int solution(int floor, int room) {
//        if (apt[floor][room] > 0) {
//            return apt[floor][room];
//
//        }
        if (floor == 0) { // 0층일 경우
            return room;

        } else { // 0층이 아닐 경우, 아래층의 1~room 거주민 수를 더함
            int count = 0;

            for (int i = 1; i <= room; i++) {
                count += solution(floor - 1, i);
            }

            return apt[floor][room] = count;

        }
    }


}