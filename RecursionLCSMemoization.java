import java.util.*;

public class RecursionLCSMemoization {
    public static int LCS(String x, String y, int n, int m) {
        int[][] dp = new int[n+1][m+1];
        for(int[] row:dp) Arrays.fill(row,-1);
//        for (int i=0; i<n+1; i++) {
//            for (int j = 0; j < m + 1; j++) {
//                System.out.print(dp[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println();
        if (n == 0 || m == 0) return 0;
        if(dp[n][m] != -1) return dp[n][m];
        if(x.charAt(n-1) == y.charAt(m-1)) {
            return dp[n][m] = 1 + LCS(x,y,n-1,m-1);
        }
        else {
            return dp[n][m] = Math.max(LCS(x,y,n,m-1),LCS(x,y,n-1,m));
        }

    }
    public static void main (String[] args) {
        String x = "abcdeh";
        String y = "abc";
        int n = x.length();
        int m = y.length();
        System.out.println("Result: "+LCS(x,y,n,m));
    }
}