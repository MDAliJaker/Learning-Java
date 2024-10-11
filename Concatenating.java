public class Concatenating {
    public static void main(String[] args) {
        String s = "MD ";
        String s1 = "Ali ";
        String s2 = "Jaker ";

        // Concatenating Using "+" Operator
        String s4 = s + s1 + s2;
        System.out.println(s4);

        // Concatenating Using concat()
        String s5 = s4.concat(" is my name.");
        System.out.println(s5);

    }
}
