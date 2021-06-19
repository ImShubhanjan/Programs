import java.util.Arrays;

public class RatinaMaze {
    public static boolean isSafeToMove(int[][] arr, int x,int y, int n) {
        if(x<n && y<n && arr[x][y] != 0) return true;
        return false;
    }

    public static boolean RatMovingInMaze(int[][] arr, int x, int y, int n, int[][] solArr) {

        if(x==n-1 && y==n-1) {
            solArr[x][y] = 1;
            return true;
        }

        if(isSafeToMove(arr, x, y, n)) {
            solArr[x][y] = 1;
            if(RatMovingInMaze(arr,x+1,y,n,solArr)) {
                return true;
            }
            if(RatMovingInMaze(arr,x,y+1,n,solArr)) {
                return true;
            }
            solArr[x][y] = 0;
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,0,1,0,1}, {1,1,1,1,1}, {0,1,0,1,0}, {1,0,0,1,1}, {1,1,1,0,1}};
        int[][] solArr = new int[5][5];
        for (int[] is : solArr) {
            Arrays.fill(is,0);   
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        if(RatMovingInMaze(arr,0,0,5,solArr) == true) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(solArr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}