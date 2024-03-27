import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String[] arr = br.readLine().split(" ");
            int repeat = Integer.parseInt(arr[0]);
            String word = arr[1];

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < word.length(); j++) {
                sb.append(word.substring(j, j + 1).repeat(repeat));
            }

            System.out.println(sb);
        }
    }
}