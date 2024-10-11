public class Exercise {
    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            // Handle empty or null arrays
            return new int[]{0, 0}; // Return [0, 0] as a default
        }

        int min = arr[0]; // Initialize min with the first element
        int max = arr[0]; // Initialize max with the first element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min if a smaller element is found
            }
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }

        return new int[]{min, max}; // Return the result as an array
    }

    public static void main(String[] args) {
        int[] input = {7, 2, 10, -4, 5, 12, 8, 1};
        int[] result = findMinMax(input);
        System.out.println("Minimum: " + result[0]);
        System.out.println("Maximum: " + result[1]);
    }
}
