public class SuperSeq {
    private static int printSuperSequence(String x, String y, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        else {
            return (m+n - LCSubString.SubString(x,y,m,n));
        }
    }
    public static void main(String[] args) {
       String x = "aggta";
       String y = "ggtax";
       int m = x.length();
       int n = y.length();
       System.out.print("Result: "+printSuperSequence(x,y,m,n));
    }
}
