public class Euler7 {
    
    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        } else {
            for (int i = 5; i * i <= n; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int count = 0;
        long num = 2;
        while (count < 10001) {
            if (isPrime(num)) {
                count++;
            }
            if (count == 10001) {
                System.out.println("The 10,001st prime number is: " + num);
            }
            num++;
        }
    }
}