//This program counts the repeated items in an array

public class Erb_Problem6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3, 5, 6, 7, 6, 8, 9, 8};

        // Count the elements in the array by using a nested for loop
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            //Prints the count of each found items.
            if (count > 0) {
                System.out.println(arr[i] + " appears " + (count + 1) + " times.");
            }
        }
    }
}