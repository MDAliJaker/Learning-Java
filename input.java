import java.util.Scanner; // only Scanner package imported from (JDK-> JRI-> JVM)
//import java.util.*; // all the package acknowledge by Oracle(owner of java)

public class input {
    public static void main(String[] args) {
        // creating Sccaner object to store inputable value.
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello I am the written Program. Enter your name please:");
        String name = scan.nextLine();
        System.out.println("Assalamu Alaikum, " + name + ", How old are you?:");
        int age = scan.nextInt();
        System.out.println("I am " + (age + 5) + ". Nice to meet you.");
    }
}
