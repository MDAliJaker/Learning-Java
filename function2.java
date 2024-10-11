public class function2 {
    
    static int multiply(int value, int value2){
        return value * value2;
    } 

    static int powerTwo(int val){
        return val * val;
    }
    public static void main(String[] args) {
        
        int result = multiply(10, 20);
        System.out.println(result);

        System.out.println("The Square of 5 is: "+ powerTwo(5));

        

    }
}
