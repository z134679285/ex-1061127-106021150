import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
            String str = scn.nextLine();
            int sum = 0;
            int len = str.length();
            for (int i = 0; i < len; i++) {
                sum = sum + (int) str.charAt(i);
            }
            System.out.println(sum);
        }
    }

