public class TopDownLCS {
    private static void LCSTopDown(String x, String y, int n, int m){
        int[][] dp = new int[n+1][m+1];
        for (int i = 0; i < n+1 ; i++) {
            for (int j = 0; j < m+1 ; j++) {
                if(i == 0 || j == 0) dp[i][j] = 0;
//                if(j == 0) dp[i][j] = 0;
            }
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if(x.charAt(i-1) == y.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i][j-1] , dp[i-1][j]);
                }
            }
        }
//        return dp[n][m];
            for (int i=0; i<n+1; i++) {
             for (int j = 0; j < m + 1; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
      }
    }
    public static void main (String[] args) {
        String x = "abcd";
        String y = "abcdfe";
        int n = x.length();
        int m = y.length();
        LCSTopDown(x,y,n,m);
    }
}
