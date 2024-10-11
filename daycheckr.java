import java.util.Scanner;

public class daycheckr {
    public static void main(String[] args) {
        System.out.println("Enter a number between 1-7 :");
        int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();

        if (x == 1) {
            System.out.println("Saturday");
        } else if (x == 2) {
            System.out.println("Sunday");
        } else if (x == 3) {
            System.out.println("Monday");
        } else if (x == 4) {
            System.out.println("Tuesday");
        } else if (x == 5) {
            System.out.println("Wednesday");
        } else if (x == 6) {
            System.out.println("Thursday");
        } else if (x == 7) {
            System.out.println("Friday");
        } else {
            System.out.println("Please enter only 1-7");
        }
    }
}
