public class Equals_String_Comparison {
    public static void main(String[] args) {
        String s1 = "MD Ali";
        String s2 = "MD Ali";
        String s3 = "MD ALI";
        String s4 = new String("MD Ali");
        String s5 = "Jaker";

        System.out.println("Comparing using equals() function: ");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equals(s4));
        System.out.println(" ");

        System.out.println("Comparing using \"==\" operator: ");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(" ");

        System.out.println("Comparison using compareTo() function: ");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s5));
    }
}
