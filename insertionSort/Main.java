public class Main{

  int[] insertion_sort(int[] arr){
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      int key = arr[i];
      int j = i-1;
      while(j >= 0 && arr[j] > key){
        arr[j+1] = arr[j];
        j -= 1;
      }
      arr[j+1] = key;
    }
    return arr;
  }
  void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

  public static void main(String[] args) {
    Main o = new Main();
    int[] a = {12, 11, 13, 5, 6, 9, 8, 16, 20, 1, 4, 17};
    o.printArray(o.insertion_sort(a));
    System.out.println();
  }
}
