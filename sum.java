public class sum {
    public static void main(String[] args) {
        int[] numbers = {12, 10, 8, 6, 4, 2}; 
        int n = numbers.length; // Number of terms in the series
        System.out.println("Number of the terms in the series: "+n);
        System.out.println("");
        int sum = 0;

        // Calculate the sum of the series (excluding 6)
        for (int i = 12; i >= 2; i -= 2) {
            if (i != 6) {
                sum += i;
            }
        }

        System.out.println("Sum of the series (excluding 6) is: " + sum);
        System.out.println("");
    }
}