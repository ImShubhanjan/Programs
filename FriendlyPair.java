public class FriendlyPair {
    private static int count(int num1, int num2) {
        int sum1 = 0, sum2 = 0;
        for(int i = 1; i<num1; i++) {
            if(num1 % i == 0) sum1 += i;
        }
         for(int i = 1; i<num2; i++) {
            if(num2 % i == 0) sum2 += i;
        }
        if(sum1 == num2 && sum2 == num1) return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        int num1 = 220, num2 = 284;
        if(count(num1,num2) == 1) System.out.println("Friendly pair");
        else
            System.out.println("Not a friendly pair");
    }
}
