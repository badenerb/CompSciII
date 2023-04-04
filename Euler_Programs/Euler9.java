public class Euler9 {
    
    public static void main(String[] args) {
        int sum = 1000;

        for (int a = 1; a < sum; a++) {
            for (int b = a + 1; b < sum; b++) {
                int c = sum - a - b;
                if (a * a + b * b == c * c) {
                    int product = a * b * c;
                    System.out.println("The Pythagorean triplet that satisfies a + b + c = " + sum + " is: " + a + ", " + b + ", " + c);
                    System.out.println("The product of the triplet is: " + product);
                }
            }
        }
    }
}
