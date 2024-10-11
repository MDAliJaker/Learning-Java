public class condition{
    public static void main(String[] args) {
        int a =10, b=20, c=30;
        if(a<b&&b<c){
            System.out.println("a<b AND b>c");
        }else{
            System.out.println("The condition is false");
        }
        if(a>b||b<c){
            System.out.println("a>b OR b>c");
        }else{
            System.out.println("The condition is false");
        }
        if(!(a+b != c)){
            System.out.println("The condition is True");
        }else{
            System.out.println("The condition is False");
        }        
    }
}