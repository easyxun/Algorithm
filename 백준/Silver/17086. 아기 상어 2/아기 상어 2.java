import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
    static class Coordinate {
        int x, y, distance;

        public Coordinate(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }

    static int[][] grid;
    static int N, M;
    static boolean[][] visited;
    static int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
    static int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        grid = new int[N][M];

        int result = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int num = grid[i][j];
                if (num != 1) {
                    int distance = bfs(i, j);
                    result = Math.max(result, distance);
                }
            }
        }
        System.out.println(result);
    }

    static int bfs(int startX, int startY) {
        visited = new boolean[N][M];
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(startX, startY, 0));
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nextX = current.x + dx[i];
                int nextY = current.y + dy[i];
                int distance = current.distance;

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M)
                    continue;
                if (visited[nextX][nextY])
                    continue;
                if (grid[nextX][nextY] == 1)
                    return distance + 1;
                visited[nextX][nextY] = true;
                queue.add(new Coordinate(nextX, nextY, distance + 1));
            }
        }
        return 0;
    }
}
