package October.ex_242024;

import java.util.Scanner;

public class lab028 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age");
        int age=sc.nextInt();
        if(age>18) {
            System.out.println("allowed to vote");
        }
        else
        {
            System.out.println("not allowed");
        }
    }
}
