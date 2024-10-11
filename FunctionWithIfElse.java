public class FunctionWithIfElse {
    static void myMethods(int age){
        if(age<18){
            System.out.println("Access denied. You ain't old enough");
        }
        else{
            System.out.println("Access granted. You are old enough");
        }
    }
    public static void main(String[] args) {
        myMethods(17);
        myMethods(23);
    }
}
