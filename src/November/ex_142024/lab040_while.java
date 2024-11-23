package November.ex_142024;

public class lab040_while {
    public static void main(String[] args) {
       // int age=args[0];
        String arg_age_string=args[0];
        int age=Integer.parseInt(arg_age_string);
        System.out.println(age);
        while(age>0)
        {
            System.out.println(age);
            age--;
        }

    }
}
