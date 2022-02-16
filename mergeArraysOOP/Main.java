/**
WAP to merge the elements of two string arrays.
The two arrays may or may not be of the same size and
 should be taken from different objects. Sort the final
 array in ascending order.
**/
import java.util.*;
public class Main{

  Scanner _in = new Scanner(System.in);

  String[] arr;
  int n;
  Main(int x){
    n = x;;
    arr = new String[n];
  }
  Main(){

  }
  void display(){
    System.out.println("printing values......");
    for (int i = 0; i < n; i++){
      System.out.print(" "+ arr[i]+" ");
    }System.out.println();
  }
  void input_arr(){
    System.out.println("enter values......");
    for (int i = 0; i < n; i++){
      arr[i] = _in.next();
    }
  }
  void merge(Main x, Main y){
    int j = 0;
    for (int i = 0; i < this.n; i++){
      if(i<x.n){
         this.arr[i] = x.arr[i];

      }
      else{
        this.arr[i] = y.arr[j];
        j++;
      }
    }
  }
  void sort(){
    System.out.println("Sorting Values.......");
    for(int i = 0; i<this.n-1; i++){
      for (int j = i+1; j<arr.length; j++){
      //compares each elements of the array to all the remaining elements
        if(arr[i].compareTo(arr[j])>0){
        //swapping array elements
          String temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
          }
      }
    }
  }
  

  public static void main(String[] args) {
      Main o = new Main();
      System.out.println("enter size: ");
      int len1 = o._in.nextInt();
      int len2 = o._in.nextInt();
      int len3 = len1 + len2;
      Main ob1 = new Main(len1);
      Main ob2 = new Main(len2);
      Main ob3 = new Main(len3);
      ob1.input_arr();
      ob2.input_arr();
      ob1.display();
      ob2.display();
      ob3.merge(ob1, ob2);
      ob3.display();
      ob3.sort();
      ob3.display();


  }
}
