public class wrapper {
    public static void main(String[] args) {
        //Wrapping a primitive data to Wrapper class's object. Then printing the object into string. 
        int a=10;
        Integer a1=a;
        System.out.println(a1.toString());

        //Autoboxing: converting primitive data to Wrapper class's object
        int b=12;
        Integer c=b;
        System.out.println(c);

        //Unboxing: converting a wrapper class's to primitive data
        Character d='D';
        char e=d;
        System.out.println(e); 
    }
}
