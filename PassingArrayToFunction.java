public class PassingArrayToFunction {
    public static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        printArray(arr);
        
        System.out.println("");//this is for making a space
        
        //An other method
        int[] arr1 = new int[]{10,20,30,40,50};
        printArray(arr1);

        System.out.println("");
        // An other way to do it
        printArray(new int[] {100,200,300,400,500});

    }
}
