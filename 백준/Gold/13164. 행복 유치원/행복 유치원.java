import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        ArrayList<Integer> arr1 = new ArrayList<>(); // 키
        ArrayList<Integer> arr2 = new ArrayList<>(); // 티셔츠 만드는 비용

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 학생 수
        int G = Integer.parseInt(st.nextToken()); // 그룹 수

        st = new StringTokenizer(br.readLine());

        // 키 저장
        while(st.hasMoreTokens()){
            arr1.add(Integer.parseInt(st.nextToken()));
        }

        // 티셔츠 만드는 비용
        for(int i = 0; i < arr1.size() - 1; i++){
            arr2.add(arr1.get(i+1) - arr1.get(i)); // 다음 인덱스 학생과의 키차이
        }

        Collections.sort(arr2); // 오름차순

        int result = 0;

        for(int i = 0; i < N - G; i++){ // N - (G - 1)번 합침 ?? 오ㅐ지..?
            result += arr2.get(i);
        }

        System.out.print(result);
    }
}