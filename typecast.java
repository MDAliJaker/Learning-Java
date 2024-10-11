public class typecast {
    public static void main(String[] args) {
        //Widening or Down casting
        System.out.println("Widening or Down casting");
        int a=10;
        long b=a;
        float c=b;
        double d=c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        //Narrowing or Up casting
        System.out.println("Narrowing or Up casting");
        double x=1234567.891011;
        long y=(long)x;
        int z=(int)y;
        short w=(short)z;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
        
    }
}
