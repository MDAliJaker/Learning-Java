import java.util.ArrayList;
import java.util.List;

public class CharacterIndicesExample {
    public static void main(String[] args) {
        String inputString = "Arafat";
        char targetChar = 'a';

        // Initialize an empty list to store the indices
        List<Integer> indicesList = new ArrayList<>();

        // Iterate through each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (currentChar == targetChar) {
                // If the current character matches the target character, add its index to the
                // list
                indicesList.add(i);
            }
        }

        // Print the collected indices
        System.out.println("Indices of '" + targetChar + "' in the string:");
        for (int index : indicesList) {
            System.out.println(index);
        }
    }
}
