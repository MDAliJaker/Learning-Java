public class FunctionOverload{

    public static int sum(int a, int b) {
        return a+b;
    }
    public static double sum(double a, double b) {
        return a+b;
    }
    public static int sum(int a, int b, int c) {
        return a+b+c;
    }
    public static void main(String[] args) {
        
        System.out.println("This will call first function " + sum(10, 20));

        System.out.println("This will call second funtion " + sum(15.00, 35.00));

        System.out.println("This will call third funtion "+ sum(10, 20, 30));
    }
}