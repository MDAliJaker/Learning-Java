public class ReturningArrayFromFunction {
    public static int[] returnArray(){
        return new int[]{10,11,12,13,14,15};
    }
    public static void main(String[] args){
        int[] arr = returnArray();//Getting the Array from function which created before
        for(int a:arr){
            System.out.println(a);
        }
        System.out.println("");
        for(int i= 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
