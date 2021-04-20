public class GCD {
    private static int FindGCD(int num1, int num2) {
        int ans = 1;
        for(int i=1; i <(num1>num2?num1:num2); i++){
            if(num1%i == 0 && num2%i == 0 && num1%i == num2%i) {
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
      int num1 = 36, num2 = 33;
      System.out.println("The GCD is: "+FindGCD(num1,num2));
    }
}
