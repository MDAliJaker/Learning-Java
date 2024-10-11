public class StringFormat {
    public static void main(String[] args) {
        System.out.println("String format on string: ");
        String name = "MAJ";
        System.out.println(String.format("Assalamu Alaikum, %s!", name));
        System.out.println(" ");

        System.out.println("String format on Integer: ");
        int age = 23;
        System.out.println(String.format("My age is %d.", age));
        System.out.println(" ");

        System.out.println("String format on Double: ");
        double pi = 3.14159D;
        System.out.println(String.format("The value of pi is approximately: %.4f", pi));
        System.out.println(String.format("The value of pi is approximately: %.5f", pi));
        System.out.println(" ");

        System.out.println("String format on the Boolean: ");
        boolean a = true;
        System.out.println(String.format("The sky is Blue: it's %b.", a));

    }
}
