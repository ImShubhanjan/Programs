package dynamicprogram;

public class Knapsack01Recursion {
    private static int knapsack_01(int wt[], int val[], int wei, int n) {
        if (n == 0 || wei == 0) {
            return 0;
        }
        if (wt[n - 1] <= wei)
            return Math.max(val[n-1] + knapsack_01(wt,val,wei-wt[n-1],n-1),knapsack_01(wt,val,wei,n-1));
        else
            return knapsack_01(wt,val,wei,n-1);
    }

    public static void main(String[] args) {
        int[] wt = {10,20,30};
        int[] val = {60,100,120};
        int w = 50;
        int n = 3;
        System.out.println("The max profit: "+knapsack_01(wt,val,w,n));
    }
}