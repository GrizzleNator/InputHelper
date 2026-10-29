import java.util.Scanner;
public class Main {
    static void main() {
        //this is where we will test our methods
        Scanner scan = new Scanner(System.in);
        String name = InputHelper.getNonZeroLenString(scan, "Please enter your full name");
        System.out.println("hello, " + name + ".");
        int age = InputHelper.getInt(scan, "Please enter your age");
        System.out.println("You are, " + age + " years old.");
        double age2 = InputHelper.getDouble(scan, "enter your age");
        System.out.println("your age is, " + age2 + " years old.");
        int goodOrNah = InputHelper.getRangedInt(scan, "Enter your integer", 1, 10);
        System.out.println("your number is " + goodOrNah);
        double goodOrNah2 = InputHelper.getRangeDouble(scan, "enter your double between ", 1.1, 10.2);
        System.out.println("your double is " + goodOrNah2);
        boolean playAgain = InputHelper.getYNConfirm(scan, "Enter Y or N");
        if (playAgain) {
            System.out.println("your going to play again");
        } else if (!playAgain) {
            System.out.println("you are not playing again");
        }


    }
}
