package October.ex_242024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lab030 {
    //enter two numbers using scanner input and tell greatest number
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1");
        int num1=sc.nextInt();
        System.out.println("enter num2");
        int num2=sc.nextInt();
        if(num1>num2) {
            System.out.println("num1>num2");
        }else if(num2>num1) {
            System.out.println("num2>num1");
        }
        else {
            System.out.println("equal");
        }
    }
}
