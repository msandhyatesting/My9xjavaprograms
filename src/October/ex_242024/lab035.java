package October.ex_242024;

public class lab035 {
    public static void main(String[] args) {
        int itemcode=003;
        switch(itemcode)
        {
            case 001,002,005:
                System.out.println("all of them are electronic");
                break;
            case 004,006,007:
                System.out.println("these are mechanical");
                break;
            default:
                System.out.println("none");
        }

    }
}
