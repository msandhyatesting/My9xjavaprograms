package October.ex_232024;

public class lab022 {
    //increment and decrement operators
    public static void main(String[] args) {
        int a=10;
        System.out.println(a++);//10 is printed
        System.out.println("a="+a);
        int b=20;
        System.out.println(++b);
        System.out.println(b);
        int c=5;
        System.out.println(c++ + 1);//5+1=6
        int d=5;
        System.out.println(++d+1);//6+1=7
        int e=10;
        System.out.println(++e+e+++e++);//11+11+12=34
        System.out.println(e);
        int f=20;
        System.out.println(--f+f+++f--);//19+19+20
        System.out.println(f);


    }
}
