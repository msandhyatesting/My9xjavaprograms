package October.ex_242024;

import java.util.Scanner;

public class lab033 {
    //switch case
    /*ask for a number between 1 to 7
    tell which day it is
    1 monday
    2 tuesday
    other number invalid
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day from 1 to 7");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("thursday");
                break;
            case 4:
                System.out.println("friday");
                break;
            case 5:
                System.out.println("saturday");
                break;
            case 6:
                System.out.println("sunday");
                break;
            default:
                System.out.println("no idea what the day is");
                break;
        }
        System.out.println("end of the switch");
        sc.close();
    }
}







