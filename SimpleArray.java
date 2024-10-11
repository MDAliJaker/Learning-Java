public class SimpleArray {
    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(num[0]);// printing first value or element of the array num variable 
        System.out.println(num[9]);;// printing last value or element of the array num variable 
        
        int[] num2 = new int[5]; // creating an array with the number of value's 

        num2[0]= 10;  // assigning value for index 0 but 1st element of the array 
        num2[1]= 20;  // assigning value for index 1 but 2nd element of the array 
        num2[2]= 30;  // assigning value for index 2 but 3rd element of the array 
        num2[3]= 40;  // assigning value for index 3 but 4th element of the array 
        num2[4]= 50;  // assigning value for index 4 but 5th element of the array 

        System.out.println(num2[0]);
        System.out.println(num2[4]);

        // Changing the value of an element of the array 
        num2[0]= 100; // by assigning new value we can cahnge the element by calling it's index
        num2[4]= 500; // changing the value of index 4 or 5th element of the array num2  
        System.out.println(num2[0]);
        System.out.println(num2[4]);
    }
}
