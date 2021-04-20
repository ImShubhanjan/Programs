import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class test
{
    public static int NoTime(int N, int H, int x, int arr[]) {
        int ans = 0;
        int p = N-1;
        Task:
        for (int i=p; i>=0; i--) {
            if(arr[i]+x >= H) {
                ans = 1;
                break Task;
            }
            else {
                ans = 0;
            }
        }
        return ans;
    }
    public static void main (String[] args)throws IOException {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input;
        input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int H = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);
        int[] arr = new int[N];
        for (int i=0; i<N ;i++) arr[i] = Integer.parseInt(input[i]);
        if(NoTime(N,H,x,arr) == 1)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}