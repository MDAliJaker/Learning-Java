
//Function is a metrhod to use specific type programe of antything like printing, suming, etc creating once using again and agian.
import java.util.Scanner; // Scanner package importing from the JVM Libery

public class function1 {
    static void PrintMessage() {
        System.out.println("This text is called frome the function named \"PrintMessage\" .");
    }

    // Integer value retrning function
    static int MultiplyByFive(int value) {
        return value * 5;
    }

    public static void main(String[] args) {

        PrintMessage();

        int output = MultiplyByFive(10);
        System.out.println(output);

        int a = 2;
        int result = MultiplyByFive(a);
        System.out.println(result);

        System.out.println("Enter the value to get 5 times of it: ");
        Scanner scan = new Scanner(System.in); // MAking a Scanner class's object "scan" to store user's input value
        int b = scan.nextInt(); // storing the value of b in scan object
        System.out.println("The 5 times of your value is : " + MultiplyByFive(b));

    }
}
