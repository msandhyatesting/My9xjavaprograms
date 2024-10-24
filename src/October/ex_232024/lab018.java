package October.ex_232024;

public class lab018 {
    public static void main(String[] args) {
        //typecasting widening implicit casting automatically done by jvm
        byte b=10;
       // int a=b;//implict
        //String s=b;//incompatible data types
        int a =(int)b;//explicit
        int val=200;
      //  byte b2=val;invalid put int in byte
        byte b2=(byte)val;//explict ....narrowing
        int course=100;
        float GST=18.45f;
       // int total_price=course+GST;invalid
        int total_price=course+(int)GST;
        System.out.println(total_price);






    }
}
