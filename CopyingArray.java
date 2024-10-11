public class CopyingArray {
    public static void main(String[] args) {
        
        int[] copyfrom = {10,20,30,40,50};

        for(int i: copyfrom){
            System.out.println(i);
        }
        System.out.println(" ");

        int[] copyto = new int[copyfrom.length];

        System.arraycopy(copyfrom, 0, copyto, 0, copyfrom.length);
        
        for(int a:copyto){
            System.out.println(a);
        }



    }
}