import java.util.Arrays;
public class SortingArray {
    public static void main(String[] args) {

        System.out.println("Integer Array sorting: ");
        int[] num= {1,2132,4231423,423,4,23,123,234,231,112,1312,3};
        System.out.println("Unsorted Array of Integer: "+ Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("Sorted Array of Integer: "+Arrays.toString(num));
        
        System.out.println(" ");
        System.out.println("String Array Sorting:");
        String[] name = {"Mohammad", "Ali", "Jaker", "Babu"};
        System.out.println("Unsorted Array of String: "+Arrays.toString(name));
        Arrays.sort(name);
        System.out.println("Sorted Array of String: "+Arrays.toString(name));

        System.out.println(" ");
        System.out.println("Character Array Sorting: ");
        char[] alphabet= {'z', 'y', 'z', 'k', 'o', '1', '*'};
        System.out.println("Unsorted Array of Characters: "+Arrays.toString(alphabet));
        Arrays.sort(alphabet);
        System.out.println("Sorted Array of Characters: "+Arrays.toString(alphabet));

    }
}
