import java.util.*;
public class Main{

  public static void main(String[] args) {
    Scanner _in = new Scanner(System.in);
    String str = _in.next();
    int num = _in.nextInt();
    String[] days = {"mon", "tues", "wed", "thurs", "fri", "sat", "sun"};
    int index = 0;
    String day = "";

    for(int i = 0; i < days.length; i++){
      if(str.equals(days[i])) index = i;
    }

    while(num>0){
      try {
        day = days[index];
      }
      catch(Exception e){
        index = 0;
      }
      index++;
      num--;
    }
    System.out.println(day);
  }
}
