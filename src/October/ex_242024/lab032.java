package October.ex_242024;

import java.util.Scanner;

public class lab032 {
    /*Triangle classifier
    inputs side1 side2 side3 double
    output string equilateral,isosceles,scalene
    logic if side1==side2&&side2==side3&&side3==side1 equilateral
    if side1==side2||side1==side3||side2==side3 isosceles
    else scalene
      */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take length of sides
        System.out.println("enter length of side1");
        double side1 = sc.nextDouble();
        System.out.println("enter length of side2");
        double side2 = sc.nextDouble();
        System.out.println("enter length of side3");
        double side3 = sc.nextDouble();
        //edge case if sides are entered negative or 0
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("invalid inputs sides must be positive");
        } else if (side1 == side2 && side2 == side3 && side3 == side1) {
            System.out.println("triangle is equilateral");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("triangle is isosceles");
        } else {
            System.out.println("triangle is scalene");
        }
        sc.close();


        }
    }

