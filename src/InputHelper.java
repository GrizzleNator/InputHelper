import java.util.Scanner;
public class InputHelper {
    //All methods should be public and static
    public static String getNonZeroLenString(Scanner scan, String prompt) {
        String s;
        boolean valid = false;
        System.out.println(prompt);
        do {
            s = scan.nextLine();
            if (s.length() > 0) {
                valid = true;
            } else {
                System.out.println("Error: Please try again. You entered a string length of 0");
            }
        }
        while (!valid);
        return s;

    }

    //All methods should be public and static
    public static int getInt(Scanner scan, String prompt) {
        int x = 0;
        boolean valid = false;
        System.out.println(prompt);
        do {

            if (scan.hasNextInt()) {
                x = scan.nextInt();
                valid = true;
            } else {
                System.out.println("Error: Please try again. You must enter an integer value");
            }
            scan.nextLine();
        }
        while (!valid);
        return x;

    }
    public static int getRangedInt(Scanner scan, String prompt, int parameter1, int parameter2 ) {
        int w = 0;
        boolean valid = false;
        System.out.println(prompt);
        do {

            if (scan.hasNextInt()) {
                w = scan.nextInt();
                if (w >= parameter1 && w <= parameter2){
                    valid = true;
                }
                else {
                    System.out.println("enter a valid integer between, " + parameter1 + " and " + parameter2 + ".");
                }
            } else {
                System.out.println("Error: Please try again. You must enter an integer value");
            }
            scan.nextLine();
        }
        while (!valid);
        return w;
    }
    public static double getDouble(Scanner scan, String prompt) {
        double s = 0;
        boolean valid = false;
        System.out.println(prompt);
        do {

            if (scan.hasNextDouble()) {
                s = scan.nextDouble();
                valid = true;
            } else {
                System.out.println("Error: Please try again. You must enter an double value");
            }
            scan.nextLine();
        }
        while (!valid);
        return s;
    }

    public static double getRangeDouble(Scanner scan, String prompt, double parameter3, double parameter4 ) {
        double k = 0;
        boolean valid = false;
        System.out.println(prompt);
        do {

            if (scan.hasNextDouble()) {
                k = scan.nextDouble();
                if (k >= parameter3 && k <= parameter4) {
                    valid = true;
                } else {
                    System.out.println("enter a valid double between, " + parameter3 + " and " + parameter4 + ".");
                }
            } else {
                System.out.println("Error: Please try again. You must enter an double value");
            }
            scan.nextLine();
        }
        while (!valid);
        return k;
    }
    public static int getPositiveNonZeroInt(Scanner scan, String prompt) {
        int v = 0;
        boolean valid = false;
        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                if(v > 0){
                    v = scan.nextInt();
                    valid = true;
                }
                else{
                    System.out.println("Please enter a valid integer");
                }
            } else {
                System.out.println("Error: Please try again. You must enter an integer value");
            }
            scan.nextLine();
        }
        while (!valid);
        return v;
    }
    public static boolean getYNConfirm(Scanner scan, String prompt) {
        String r;
        boolean valid = false;
        boolean user = false;
        System.out.println(prompt);
        do {
            r = scan.nextLine();
            if (r.equalsIgnoreCase("Y")) {
                valid = true;
                user = true;
            } else if (r.equalsIgnoreCase("N")) {
                valid = true;
            }
            else {
                System.out.println("Enter a valid Y or N");
            }
        }
        while (!valid);
        return user;
    }
}
