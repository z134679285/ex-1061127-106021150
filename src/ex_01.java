import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int h1= scn.nextInt();
        int m1= scn.nextInt();
        int h2= scn.nextInt();
        int m2= scn.nextInt();
        int total= 60*(h2-h1)+m2-m1;
        int v1= total/30,sum=0;
        if(v1>4){
            sum=120;
            v1=v1-4;
        }else {
            sum=v1*30;
        }if(v1>4){
            sum=sum+160;
            v1=v1-4;
        }else {
            sum=sum+v1*40;
        }if(v1>0){
            sum=sum+v1*60;
        }
        System.out.println(sum);
        }
    }

