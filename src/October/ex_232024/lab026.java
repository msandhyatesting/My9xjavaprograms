package October.ex_232024;

import java.util.Scanner;

public class lab026 {
    public static void main(String[] args) {
        //take name,age,salary and print in the end

        Scanner sc1=new Scanner(System.in);
                System.out.println("enter name\n");
        String name=sc1.next();

        Scanner sc2=new Scanner(System.in);
        System.out.println("enter age\n");
        int age=sc2.nextInt();

        Scanner sc3=new Scanner(System.in);
        System.out.println("enter salary\n");
        float salary=sc3.nextFloat();
        System.out.printf("\nname is %s",name);
        System.out.printf("\nage is %d",age);
        System.out.printf("\nsalary is %f",salary);
        }

    }

