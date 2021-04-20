import java.util.Arrays;

public class knapsack01byDP{
    private static int knapsack_01byDP(int wt[], int val[], int wei, int n) {
        int[][] arr = new int[100][1000];
        for(int[] rows: arr) Arrays.fill(rows,-1);

        if (n == 0 || wei == 0) {
            return 0;
        }
        if(arr[n][wei] != -1)
            return arr[n][wei];
        if (wt[n - 1] <= wei)
            return arr[n][wei] =  Math.max(val[n - 1] + knapsack_01byDP(wt, val, wei - wt[n - 1], n - 1), knapsack_01byDP(wt, val, wei, n - 1));
        else
            return arr[n][wei] = knapsack_01byDP(wt, val, wei, n - 1);
    }

    public static void main(String[] args) {
        int[] wt = {10,20,30};
        int[] val = {60,100,120};
        int w = 50;
        int n = 3;
        System.out.println("The max profit: "+knapsack_01byDP(wt,val,w,n));
    }
}