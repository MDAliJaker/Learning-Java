public class String1 {
    public static void main(String[] args) {
        String name = "MD Ali Jaker";
        System.out.println(name);
        System.out.println(" ");
        // length finding method
        int a = name.length();
        System.out.println("Length of the namei s : " + a);
        System.out.println(" ");

        // word index finding among string method
        int b = name.indexOf("Jaker");
        System.out.println("Index of 'Jaker' word starts from: " + b);
        System.out.println(" ");

        // character index finding among string method
        String n = "Arafat";
        System.out.println("Index of character 'a' in " + n + " is: " + n.indexOf('a'));
        System.out.println(" ");

        // Startwith method
        System.out.println("Startwith method");
        System.out.println(name.startsWith("MD"));
        System.out.println(" ");

        // Endwith method
        System.out.println("Endwith method");
        System.out.println(name.endsWith("ker"));
        System.out.println(" ");

        // charAt() method
        System.out.println("charAt index method");
        System.out.println("Character at index 0: " + name.charAt(0));
        System.out.println("Character at index 4: " + name.charAt(3));
        System.out.println(" ");

        // replace() method
        System.out.println("Replace method-");
        String one = "X is a Vota. Because X is so dumb.";
        System.out.println(one);
        String replacedone = one.replace("X", "Saiful");
        System.out.println(replacedone);
        System.out.println(" ");

        // length method
        System.out.println("Length method");
        System.out.println(replacedone.length());
        System.out.println(" ");

        // isEpmty() method
        System.out.println("isEpmty() method");
        String full = "Hello world!";
        String empty = "";
        String semi_empty = "   ";
        System.out.println(full.isEmpty());
        System.out.println(empty.isEmpty());
        System.out.println(semi_empty.isEmpty());
        System.out.println(semi_empty.trim().isEmpty());
        System.out.println("  ");

        // concat() method
        System.out.println("concat() method");
        String n1 = "MD ";
        String n2 = "Ali ";
        String n3 = "Jaker";
        String fullname = n1.concat(n2).concat(n3);
        System.out.println(fullname);

    }
}
