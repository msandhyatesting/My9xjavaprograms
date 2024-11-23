package November.ex_142024;

public class lab039_for {
    public static void main(String[] args) {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c);
        }
        //even numbers from 1 to 10
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                System.out.println("odd" + i);
            }
        }
//break and for loop
        for (int i = 0; i < 50; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }


    }
}