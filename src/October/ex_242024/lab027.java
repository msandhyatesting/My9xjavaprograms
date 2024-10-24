package October.ex_242024;

public class lab027 {
    /*take user input 2 numbers
 from arguments and cal max using ternary operator*/
    public static void main(String[] args) {


        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        int z=Integer.parseInt(args[2]);
        System.out.printf("the numbers are %d %d %d", x, y, z);
      // int bigger =System.out.println((x>=y&&x>=z)?x:(y>=z?y:z));
        //System.out.printf("bigger number is %d",bigger);
        System.out.println((x>=y&&x>=z)?x:(y>=z?y:z));


    }
}