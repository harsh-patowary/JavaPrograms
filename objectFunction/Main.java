import java.util.*;
class Main{

    int a,b;
    Main(int x,int y){
        a=x;
        b=y;
    }
    Main(){

    }
    void display(){
        System.out.println(a);
        System.out.println(b);

    }

    void sum(Main x, Main y){
        System.out.println(x.a+x.b+y.a+y.b);

    }
     public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
         Main ob1=new Main(2,3);
         Main ob2=new Main(7,8);
         Main ob3=new Main();
         ob1.display();
         ob2.display();
         ob3.sum(ob1, ob2);
    }
  }
