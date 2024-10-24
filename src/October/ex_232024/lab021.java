package October.ex_232024;

public class lab021 {
    /*grade  score>=90 grade A
    score>=80 grade B
    score>=70 grade C
    score >=60 grade D
    score<=60 grade F
     */
    public static void main(String[] args) {
        int  score=85;
        String grade=(score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";
        System.out.println("your grade is"+grade);
        System.out.printf("your grade is %s",grade);


    }

}
