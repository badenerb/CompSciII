//This program will find the second largest and second smallest element in an array
//It can do this with one or two dimensional arrays.

public class Erb_Problem4 {
    public static void main(String[] args) {
        //Hardcoded arrays
        int[] arr = {5, 2, 70, 1, 9, 3};
        int[][] arr2d = {{5, 200, 7}, {1, 9, 3}, {4, 8, 6}};
         
        //Calls the corresponding methods for the one dimensional array
        int secondLargest = findSecondLargest(arr);
        int secondSmallest = findSecondSmallest(arr);
        
        //Calls the corresponding methods for the two dimensional array
        int secondLargest2d = findSecondLargest(arr2d);
        int secondSmallest2d = findSecondSmallest(arr2d);

        //Prints the answers the methods found
        System.out.println("Second largest element in 1D array: " + secondLargest);
        System.out.println("Second smallest element in 1D array: " + secondSmallest);
        System.out.println("Second largest element in 2D array: " + secondLargest2d);
        System.out.println("Second smallest element in 2D array: " + secondSmallest2d);
    }
    
    //This mehtod will find the second largest int in one dimesnional array arr
    //Then it will return an int, that is the second largest int in arr
    public static int findSecondLargest(int[] arr) {
        //ints that will temporarly hold largest and second largest numbers.
        //Currently set to the first index in the array (this will eventually change)
        int largest = arr[0];
        int secondLargest = arr[0];
        
        //Loops throuhg the array and finds the largest and the second largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        
        //Returns the secondlargest int
        return secondLargest;
    }
    
    //This mehtod will find the second smallest int in one dimesnional array arr
    //Then it will return an int, that is the second smallest int in arr
    public static int findSecondSmallest(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = arr[0];

        //Like the largest method, this loops throuhg the array and finds the smallest and the second smallest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }
    
    //This method will find the second largest int in a 2d array
    public static int findSecondLargest(int[][] arr) {
        int largest = arr[0][0];
        int secondLargest = arr[0][0];

        //Nested for loops that find the second largest int and largest int
        for (int[] row : arr) {
            for (int num : row) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num;
                }
            }
        }
        //Returns the result.
        return secondLargest;
    }

    public static int findSecondSmallest(int[][] arr) {
        int smallest = arr[0][0];
        int secondSmallest = arr[0][0];

        for (int[] row : arr) {
            for (int num : row) {
                if (num < smallest) {
                    secondSmallest = smallest;
                    smallest = num;
                } else if (num < secondSmallest && num != smallest) {
                    secondSmallest = num;
                }
            }
        }

        return secondSmallest;
    }
}