package October.ex_232024;

public class lab012 {
    //unary operators
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a+b);
        String name1="madan";
        String name2="mohan";
        System.out.println(name1+name2);//operator overloading
        /*here + add integers and concatenate strings*/
        System.out.println(name1+name2+a+b);//concatenation is performed
        System.out.println(a+b+name1+name2);//add n concatenate
        System.out.println(name1+name2+(a+b));


    }


}

