public class IterateArray {
    
    public static void main(String[] args) {
        String[] name = { "Mohammad","Ali", "Jaker", "Babu"};
        
        int arrSize = name.length;
        System.out.println(arrSize);

        for (int i=0; i < arrSize; i++){
            System.out.println("For index "+ i + " the name is: "+ name[i]);
        }

        int[] num = {23,45,325,3,413,4};
        int size = num.length;
        System.out.println(size);
        for(int i= 0; i<size ; i++){
            System.out.println("For index "+ i +" the number is: "+num[i]);
        }
    }
}
