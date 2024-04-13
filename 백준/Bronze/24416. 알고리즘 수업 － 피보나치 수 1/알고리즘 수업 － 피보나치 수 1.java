import java.util.*;
import java.io.*;

public class Main {

    static int countFib;
    static int countFibonacci;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        fib(N);
        fibonacci(N);

        System.out.println(countFib + " " + countFibonacci);
    }

    private static int fibonacci(int n) {
        int[] f = new int[n+1];
        f[0] = 1;
        f[1] = 1;
        // f[1] < -f[2] < -1;
        for(int i = 2; i<n; i++){
            countFibonacci++;
            f[i] = f[i - 2] + f[i - 1];
        }
        return f[n-1];
    }

    private static int fib(int n) {
        if (n == 1 || n == 2){
            countFib++;
            return 1;  // #코드1
        }
        return (fib(n - 1) + fib(n - 2));
    }


}