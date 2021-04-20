public class EqualPartition {
    private static boolean printEqualPartition(int[] arr, int n) {
        int sum = 0;
//        SubsetSum ob = new SubsetSum();
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        if(sum % 2 != 0) return false;
        else return SubsetSum.subset(arr, sum/2, n);
    }
    public static void main(String[] args) {
     int[] arr = new int[]{1,5,11,5,2,1};
     int n = 6;
     System.out.println("Result: "+printEqualPartition(arr,n));
    }
}
