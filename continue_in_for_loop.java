public class continue_in_for_loop {
    public static void main(String[] args) {
        for(int a=1; a<=10; a++){
            if(a==5){
                continue;
            }
            System.out.println(a);
        }
    }
}
