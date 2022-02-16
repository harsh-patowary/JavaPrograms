import java.util.*;

class Plots {

  int shaped_plots(int[][] arr, int r, int c){
    return 0;
  }
  boolean checkSegment(int[] a){
    for(int i = 1; i < a.length; i++){
      if(a[i-1]==a[i]){

      }
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner _in = new Scanner(System.in);
    Plots o = new Plots();
    int T = _in.nextInt();
    for (int i = 1; i <= T; i++) {
      int R = _in.nextInt();
      int C = _in.nextInt();
      int[][] mat = new int[R][C]
      for (int j = 0; j < R; j++) {
        for (int k = 0; k < C; k++) {
          mat[j][k] = _in.nextInt();
        }
      }
      int goodShapes = o.shaped_plots(mat, R, C);
      System.out.println("Case #"+i+": "+ goodShapes);
    }


  }
}
