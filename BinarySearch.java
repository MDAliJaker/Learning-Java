import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,5,7,9,11};
        System.out.println(Arrays.toString(numbers));
        int index = Arrays.binarySearch(numbers, 7);
        System.out.println("Index of 7 in the array: "+index);
        System.out.println(" "); // |This is just for a row break
        index = Arrays.binarySearch(numbers, 10);
        System.out.println("Index of 10 in the array: "+index);
        System.out.println(""); // |This is just for a row break
        index = Arrays.binarySearch(numbers, 11);
        System.out.println("Index of 11 in the array: "+ index);
    }
}
