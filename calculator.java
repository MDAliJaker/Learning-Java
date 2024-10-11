import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        double num1 = scan.nextDouble();
        
        System.out.println("Enter the second number: ");
        double num2 = scan.nextDouble();

        System.out.println("Enter the operator(+, -, *, /, %, ^): ");
        char operator = scan.next().charAt(0);
        double result = 0.0;

        switch(operator){
            case '+':
                result= num1+num2;
            break;
            case '-':
                result= num1-num2;
            break;
            case '*':
                result= num1*num2;
            break;
            case '/':
                result= num1/num2;
            case '%':
                result= num1%num2;
            break;
            case '^':
            result= Math.pow(num1, num2);
            break;
            default:
                System.out.println("Wrong Operator!!!");
            break;
        }
        System.out.println(num1+" "+operator+" "+num2+" "+"="+" "+result);

    }
}
