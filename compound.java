public class compound {
    public static void main(String [] arg){
        
        //Increament 
        System.out.println("Incremenmt:  ");
        int x=10;
        System.out.println(x);
        x++; //Here, x++ = x+1 = 10+1 = 11 will be value of x.
        System.out.println(x);
        System.out.println(++x);//pre-Increment: From this line value of x wil be x+1. 
        x++;
        System.out.println(x);
        System.out.println(x++); //post-Increment: After this line value of x wil be x+1. 
        System.out.println(x);
        System.out.println(x);


        //Decrement
        System.out.println("Decremenmt:  ");

        int y=20; 
        System.out.println(y);
        y--; //Here, y-- = y-1 = 20-1 = 19 will be the value of y frome here.
        System.out.println(y);
        System.out.println(--y); //pre-Decrement: From this line value of y wil be y-1. 
        System.out.println(y);
        y--;
        System.out.println(y);
        System.out.println(y--); //post-Increment: After this line value of y wil be y+1. 
        System.out.println(y);
        
    }
}
