import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int a= scn.nextInt();
        int b= scn.nextInt();
        int c= scn.nextInt();
        int d= scn.nextInt();
       if(a==b && b==c && c==d && a==d){
           System.out.println("WIN");
       }else if(a!=b && b!=c && c!=d && d!=a ){
           System.out.println("R");
       }else if (a==b && a!=c && a!=d || b==c && b!=a && b!=d || c==d && c!=a && c!=b || a==d && d!=b && d!=c){
           System.out.println(Math.max(Math.max(a,b),c)*2);
       }
    }
}

