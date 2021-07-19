public class MinHeapandHeapSort {
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
      }
      public static void Minsort(int[] arr) {
        int length = arr.length;
        for(int i = (length/2)-1; i >= 0; i--) {
          Minheapify(arr, length, i);
        }
        System.out.println("Min Heap: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for(int i = length-1; i > 0; i--) {
          swap(arr, i, 0);
  
         Minheapify(arr, i, 0);
        }
      }
      public static void Minheapify(int[] arr, int length, int i) {
        int min = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        
        if(left < length && arr[left] < arr[min]) min = left;
        
        if(right < length && arr[right] < arr[min]) min = right;
        
        if(min != i) {
          swap(arr, min, i);
          Minheapify(arr, length, min);
        }
    }
    public static void main (String[] args) {
      
        int[] arr = new int[]{78,25,31,1,92,23};
        Minsort(arr);
        System.out.println("\nSorted array: ");
        for(int i=0; i<arr.length; i++) {
          System.out.print(arr[i] + " ");
        }
    }
}
