import java.util.Arrays;
import java.util.Scanner;

public class NQueens {
    public static boolean isSafeToMove(int[][] arr, int x, int y, int n) {
        for (int i = 0; i < x; i++) {
            if(arr[i][y] == 1) {
                return false;
        }
        int rows = x;
        int columns = y;
        while(rows >= 0 && columns >= 0) {
            if(arr[rows][columns] == 1) return false;
            rows--;
            columns--;
        }
        rows = x;
        columns = y;
        while(rows >= 0 && columns < n) {
            if(arr[rows][columns] == 1) return false;
            rows--;
            columns++;
        }
    }
    return true;
}
    public static boolean NQueensFunc(int[][] arr, int x, int n) {
        int col;

        if(x >= n) return true;

        for(col = 0; col < n; col++) {

           if(isSafeToMove(arr,x,col,n) == true) {
               arr[x][col] = 1;
           
               if(NQueensFunc(arr,x+1,n) == true) {
                   return true;
               }
            arr[x][col] = 0;
           }
        } 
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size = sc.nextInt();
        int[][] arr = new int[size][size];
        for (int[] is : arr) {
            Arrays.fill(is,0);
        }
        System.out.println();
        if(NQueensFunc(arr,0,size)) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
