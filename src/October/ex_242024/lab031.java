package October.ex_242024;
1

import java.util.Scanner;

public class lab031 {
    /*write a program that calculates and display
     letter grade for a given numerical score (ABCDEF)based on grading scale
     A:90-100
     B:80-89
     C:70-79
     D:60-69
     F:0-59
     logic:
     step1:take input score 0-100 int
     output grade char
     step2 :rough logic
     if score>=90 and score<=100 return or print A
     elseif score<=89&&score>=80 B
     elseifscore<=79&&score>=70 C
         */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the score");
        int score=sc.nextInt();
        char grade='F';
        if(score>=90&&score<=100) {
            grade = 'A';
        }else if(score>=80&&score<=89) {
            grade = 'B';
        }
        else if(score>=70&&score<=79) {
            grade = 'c';
        }
        else if(score>=60&&score<=69) {
            grade = 'D';
        }
        else if(score<=0||score>100)//edge case
        {
            System.out.println("lol");
            grade='o';

        }
        else{grade='F';
        }
        System.out.println("your grade is"+grade);

    }
}
