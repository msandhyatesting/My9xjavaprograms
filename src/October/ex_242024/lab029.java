package October.ex_242024;

import java.util.Scanner;

public class lab029 {
    //take user input check if the number is odd/even
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number,I will tell you if it is odd or even");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("number is even");
        }
        else
        {
            System.out.println("number is odd");
        }
    }
}
