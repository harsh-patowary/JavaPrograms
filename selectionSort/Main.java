public class Main{

  int[] selection_sort(int[] arr){
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int min_idx = i;

      for(int j = i+1; j < n; j++)
        if(arr[j] < arr[min_idx])
          min_idx = j;

      int temp = arr[min_idx];
      arr[min_idx] = arr[i];
      arr[i] = temp;
    }

    return arr;
  }
  void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

  public static void main(String[] args) {
    Main o = new Main();
    int arr[] = {64,25,12,22,11};
    o.printArray(o.selection_sort(arr));
  }
}
