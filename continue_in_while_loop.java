public class continue_in_while_loop {
    public static void main(String[] args) {
        int i=1;
        while(i<10){
            if(i==4){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
