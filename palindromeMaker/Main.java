import java.util.Scanner;
import java.io.*;

public class Main {
    Scanner _in = new Scanner(System.in);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String str;
    String palindrome;
    Main(){
        str = "";
        palindrome = "";
    }

    void input() throws IOException{
        
        str = reader.readLine();
        getPalin();
    }
    String reverse(){
        String r = "";
        for(int i=str.length()-1;i>=0;i--){
            r += str.charAt(i);
        }
        return r;
    }

    void getPalin(){
        String revStr = reverse();
        
        String palindrome = "";
        String f = revStr.substring(repeatingChar(revStr));
        //if(f.charAt(0)==str.charAt(str.length()-1)) 
        palindrome = str.concat(f);

        System.out.println(palindrome);
        
    }
    int repeatingChar(String s){
        int l=s.length();
        int repeats = 0;
        for(int i=1;i < l-1;i++){

            if(s.charAt(i)==s.charAt(i-1)) repeats++;
        }
        return repeats;
    }

    public static void main(String[] args) throws java.io.IOException {
        Main o = new Main();
        o.input();
    }
}