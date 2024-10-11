public class SubString {
    public static void main(String[] args) {
        String a = "Programming";
        System.out.println(a);
        String b = a.substring(0, 7);
        System.out.println(b);

        String name = "MD Ali Jaker";
        System.out.println("Full Name: " + name);
        String fname = name.substring(0, name.length() - 5);
        System.out.println("First Name : " + fname);
        String lname = name.substring(name.length() - 5, name.length());
        System.out.println("Last Name : " + lname);
    }
}
