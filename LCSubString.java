public class LCSubString {
    public static int SubString(String x, String y, int m, int n) {
        int dp[][] = new int[m+1][n+1];
        for (int i = 0; i < m+1 ; i++) {
            for (int j = 0; j < n+1 ; j++) {
                if(i == 0 || j == 0) dp[i][j] = 0;
            }
        }
        for (int i = 1; i < m+1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = 0;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m+1; i++) {
            for (int j = 0; j < n+1; j++) {
                if (max < dp[i][j]) {
                    max = dp[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String x = "abch";
        String y = "abcdr";
        int m = x.length();
        int n = y.length();
        System.out.println("Result: " +SubString(x,y,m,n));
    }
}
