public class MinInsertDeleteLCS {
    public static void InsertDelete(String x, String y, int n, int m) {
        if(n == 0 || m == 0) System.out.print("Insertion: 0" +"    "+ "Deletion: 0");
        else {
            System.out.print("Insertion: "+(m-RecursionLCSMemoization.LCS(x, y, n, m))+"    "+"Deletion: "+(n-RecursionLCSMemoization.LCS(x, y, n, m)));
        }
    }
    public static void main(String[] args) {
      String x = "heap";
      String y = "pea";
      int n = x.length();
      int m = y.length();
      InsertDelete(x,y,n,m);
    }
}
