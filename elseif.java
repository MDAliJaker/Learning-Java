public class elseif {
    public static void main(String[] args) {
        int a=10;
        if(a<10){ //first condition in else-if statement
            System.out.println("a<10"); // if the first condition is true it will run
        }else if(a>10){ //2nd condition in else if statement 
            System.out.println("a>10"); // if 2nd condition is true it will run.
        }else{ // if the previous condition under "if" or "else if" does not come true this will run
            System.out.println("a=10");// if there is no condition it will run.
        }
    }
}
