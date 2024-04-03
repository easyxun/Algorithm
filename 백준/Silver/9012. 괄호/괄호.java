/*
입력
1. BR로 데이터를 읽는다
2. 테스트데이터 갯수를 int N에 저장한다
3. 한 줄 씩 String s 에 저장한다
4. for문으로 한 줄 씩 solution() 한다

solution()
1. toCharArray로 문자열을 char배열로 변환한다
2. 스택에 char배열 0번 인덱스부터 '('이면 push한다
3. ')'일 경우 pop한다.
4. '(' ')' ')' 스택이 비었을 경우 pop할 수 있기 때문에 예외처리 해준다
5.
 */

import java.io.*;
import java.util.*;


public class Main {
    public static void  main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 테스트 데이터 갯수

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            System.out.println(solution(s) ? "YES" : "NO");
        }

    }

    private static boolean solution (String s) {

        Stack<Character> stack = new Stack<>();

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            char c = arr[i];

            if (c == '(') {
                stack.push(c);
            } else {
                if(stack.isEmpty()){ // 예외처리
                    return false;
                }
                stack.pop();
            }

        }

        return stack.isEmpty();

    }



}