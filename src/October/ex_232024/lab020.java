package October.ex_232024;

public class lab020 {
    //find largest number in three numbers usin gternary operator
    public static void main(String[] args) {
        int a=10;
                int b=20;
                int c=30;
       // String largest =(a>b&&a>c)?"a":(b>c?"b":"c");
        //System.out.println(largest);
        int d=(a>b&&a>c)?a:(b>c?b:c);
        System.out.println("largest number is"+d);


    }
}
