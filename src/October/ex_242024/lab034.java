package October.ex_242024;

import java.util.Scanner;

public class lab034 {
    //web automaation
    /*ask user which browser to run the code
    chrome executes chrome
    firefox firefox execute
    edge edge browser
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the browser");
        String browser=sc.next();
        switch(browser) {
            case "chrome":
                System.out.println("starting chrome");
                break;
            case "firefox":
                System.out.println("starting firefox");
                break;
            case "edge":
                System.out.println("starting edge");
                break;
            default:
                System.out.println("i have no idea which browser to start");
                break;
        }



        }

    }

