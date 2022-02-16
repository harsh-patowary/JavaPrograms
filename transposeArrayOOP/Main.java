import java.util.*;

public class Main{

  Scanner _in = new Scanner(System.in);
  int[][] a;
  int n, m;
  Main(int x, int y){
    n = x;
    m = y;
    a = new int[n][m];
  }
  Main(){}


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
  void transpose(Main mat1){
    int i, j;
          for (i = 0; i < mat1.m; i++)
              for (j = 0; j < mat1.n; j++)
                  this.a[i][j] = mat1.a[j][i];
  }

  public static void main(String[] args) {
    Main o = new Main();
    System.out.println("enter dimensions...... ");
    int row = o._in.nextInt(), col = o._in.nextInt();
    Main ob1 = new Main(row, col);
    Main ob2 = new Main(col, row);
    ob1.input_mat();
    ob1.display();
    ob2.transpose(ob1);
    ob2.display();
  }
}
