//This program will change the numbers in and array so that the ints in the array appear in reversed order without 
//creating a new array. Using a temp variable.

public class Erb_Problem3 {
    public static void main(String[] args) {
        //Hardcoded array
        int[] arr = {1, 2, 3, 4, 5};
        //Temp int
        int temp;
        //Finds and stores the length of the array.
        int n = arr.length;
         
        //Loops through the first half of the array by cutting the legnth of the array in half
        for (int i = 0; i < n / 2; i++) {
            //Stores the index of array in temp variable
            temp = arr[i];
            //Assigns the current index to the same index on the back half of the array
            arr[i] = arr[n - 1 - i];
            //Assigns that same spot the temp variable
            arr[n - 1 - i] = temp;
        }

        System.out.print("Reversed array is: ");
        //Loops through the array and prints the new assignments.
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}