
public class CoinChange {
    private static void minCount(int S[], int sum, int n) {
       int[][] dp = new int[n+1][sum+1];
       for (int i=0; i<n+1; i++) {
           for (int j=0; j<sum+1; j++) {
//               if(i == 0 && j == 0)
//                   dp[i][j] = Integer.MAX_VALUE-1;
               if(i == 0)
                   dp[i][j] = Integer.MAX_VALUE-1;
               if(j == 0 && i!= 0)
                   dp[i][j] = 1;
               if(i == 1 && j==1) {
                   if(j % S[0] == 0)
                       dp[i][j] = j/S[0];
                   else
                       dp[i][j] = Integer.MAX_VALUE-1;
             }
           }
       }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1 ; j++) {
                if(S[i-1] <= j) {
                    dp[i][j] = Math.min(dp[i][j-S[i-1]]+1,dp[i-1][j]);
                }
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        for (int i=0; i<n+1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                System.out.print(dp[i][j] +" ");
            }
            System.out.println();
        }
        //return dp[n][sum];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2};
        int n = arr.length;
        int sum =2;
        //System.out.println("Minimum number of Coins: " +minCount(arr,sum,n));
        minCount(arr,sum,n);
    }
}