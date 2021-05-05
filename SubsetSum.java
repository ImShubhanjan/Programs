public class SubsetSum {
    public static boolean subset(int arr[], int sum, int n) {
        boolean dp[][] = new boolean[n + 1][sum + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sum; j++) {
                if(i == 0)
                    dp[i][j] = false;
                if(j == 0)
                    dp[i][j] = true;
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i-1][j - arr[i-1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int arr[] = new int[]{2, 3, 7, 8, 10};
        int sum = 14;
        int n = 5;
        System.out.println(subset(arr,sum,n));
    }
}
