import java.util.ArrayList;
public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(0, 10);
        arr.add(20);
        arr.add(39);
        for(int i : arr){
            System.out.println(i);
        }
        System.out.println("ArrayList with 3 element above ^");

        arr.add(40);
        arr.add(50);
        for(int i : arr){
            System.out.println(i);
        }
        System.out.println("ArrayList with 5 element above ^ after adding two new element");

        arr.remove(0);
        for(int i : arr){
            System.out.println(i);
        }
        System.out.println("ArrayList above ^ is after index 0's element removed");
        arr.remove(2);// when index 0 is removed then there is only 2 element left with index 0 (prevoius 1 is passed 0) and 1

        for(int i : arr){
            System.out.println(i);
        }
        System.out.println("ArrayList above ^ is after index 2's element removed");

    }
}
