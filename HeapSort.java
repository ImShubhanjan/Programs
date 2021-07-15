public class HeapSort {
    public static void swap(int[] arr, int a, int b) {
      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;
    }
    public static void sort(int[] arr) {
      int length = arr.length;
      for(int i = (length/2)-1; i >= 0; i--) {
        heapify(arr, length, i);
      }
      System.out.println("Max Heap: ");
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
      for(int i = length-1; i > 0; i--) {
        swap(arr, i, 0);

        heapify(arr, i, 0);
      }
    }
    public static void heapify(int[] arr, int length, int i) {
      int large = i;
      int left = 2 * i + 1;
      int right = 2 * i + 2;
      
      if(left < length && arr[left] > arr[large]) large = left;
      
      if(right < length && arr[right] > arr[large]) large = right;
      
      if(large != i) {
        swap(arr, large, i);
        heapify(arr, length, large);
      }
    }
    public static void main (String[] args) {
      
      int[] arr = new int[]{10,20,15,12,40,25,18};
      sort(arr);
      System.out.println("\nSorted array: ");
      for(int i=0; i<arr.length; i++) {
        System.out.print(arr[i] + " ");
      }
    }
  }  
