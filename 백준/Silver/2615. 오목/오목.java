import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;
    static int N = 19;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean chk = true;
        map = new int[19][19];
        int[] dx = new int[] {1, 0, -1, 1}, dy = new int[] {1, 1, 1, 0};  // 4방 탐색 (출력의 기준점은 1.좌측 2.상단 순서이므로 우에서 좌로 오는것은 생각 X)

        for (int i = 0; i < 19; i++) {
            // 입력
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 19; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 19; i++) {  // 맵 전체 확인
            for (int j = 0; j < 19; j++) {
                int prev = -1;
                if (map[i][j] == 1 || map[i][j] == 2) {  // 흑 or 백 확인후 선택
                    prev = map[i][j];
                    for (int k = 0; k < 4; k++) {  // a, b케이스는 4가지임
                        int cnt = 1;
                        int ii = dx[k], jj = dy[k];  // 변동되는 좌표
                        if (i + ii >= 19 || i + ii < 0 || j + jj >= 19 || j + jj < 0)
                            continue;
                        while (map[i + ii][j + jj] == prev) {  // 연속되는 자리가 시작 위치랑 같으면 cnt 증가
                            cnt++;
                            ii += dx[k];
                            jj += dy[k];
                            if (cnt > 5)
                                break;
                            if (i + ii >= 19 || i + ii < 0 || j + jj >= 19 || j + jj < 0)
                                break;
                        }
                        if (i - dx[k] >= 0 && j - dy[k] >= 0 && i - dx[k] < 19 && j - dy[k] < 19)
                            if (map[i - dx[k]][j - dy[k]] == prev)  // 5번을 다하고 돌아왔을때 반대로 돌이 있는경우 6이된다. 이런 경우 이미 지나온 경로이므로 거짓으로 판단. 종료시킴
                                continue;
                        if (cnt == 5) {  // 6목의 경우는 31번 줄에서 판단 했으므로 5개의 경우 5목으로 판단함.
                            System.out.println(prev);
                            System.out.println(String.valueOf(i + 1) + " " + String.valueOf(j + 1));
                            chk = false;
                            return;
                        }
                    }
                }
            }
        }
        if (chk)
            System.out.println(0);
    }
}
