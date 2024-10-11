public class continue_in_do_while_loop {
    public static void main(String[] args) {
        int i=0;
        do{
            if(i==4){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }while(i<10);
    }
}
