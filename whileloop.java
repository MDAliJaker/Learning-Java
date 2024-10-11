import java.util.Scanner;
public class whileloop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of i= ");
        int i=scan.nextInt();
        while(i>50){
            System.out.println(i);
            i--;
        }

        while(i<=20){
            System.out.println(i);
            i++;
        }
    }
}
