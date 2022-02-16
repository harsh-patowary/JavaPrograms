/**
sub matrix of same array but different objs

**/

import java.util.*;
class Main{
    Scanner _in = new Scanner(System.in);
    int[][] a;
    int n, m;
    Main(int x,int y){
        n=x;
        m=y;
        a = new int[n][m];
    }
    // Main(){
    //
    // }
    void display(){
      System.out.println("printing values....");
      for (int i = 0 ; i < n ;i++ ) {
        for (int j = 0; j < m ; j++ ) {
          System.out.print(" "+a[i][j]+" ");
        }
        System.out.println();
      }
    }

    void input_mat(){
      System.out.println("Enter values....");
      for (int i = 0 ; i < n ;i++ ) {
        for (int j = 0; j < m ; j++ ) {
          a[i][j] = _in.nextInt();
        }
      }
    }

    void subtract(Main x, Main y){
      System.out.println("subbing values....");
      for (int i = 0 ; i < n ;i++ ) {
        for (int j = 0; j < m ; j++ ) {
          this.a[i][j] = x.a[i][j] - y.a[i][j];
        }
      }
    }
     public static void main(String[] args){

         Main ob1=new Main(2,2);
         Main ob2=new Main(2,2);
         Main ob3=new Main(2,2);
         ob1.input_mat();
         ob2.input_mat();
         ob1.display();
         ob2.display();
         ob3.subtract(ob1, ob2);
         ob3.display();
    }
  }
