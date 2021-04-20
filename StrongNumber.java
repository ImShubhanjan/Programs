public class StrongNumber {
    private static int Strong(int num) {
        int  sum = 0, temp = num;
        while(num > 0) {
            int fact = 1;
            int rem = num % 10;
            for(int i=1; i<=rem; i++) {
                fact = fact*i;
            }
            sum += fact;
            num = num/10;
        }
        if(sum == temp) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        int num1 = 40585;
        if(Strong(num1) == 1) System.out.println("Strong Number");
        else System.out.println("Not Strong number");
    }
}
