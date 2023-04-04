public class Euler10 {
    
    public static void main(String[] args) {
        long limit = 2000000;
        long sum = 0;

        boolean[] primes = new boolean[(int)limit];
        for (int i = 2; i < limit; i++) {
            primes[i] = true;
        }

        for (int p = 2; p * p < limit; p++) {
            if (primes[p]) {
                for (int i = p * p; i < limit; i += p) {
                    primes[i] = false;
                }
            }
        }

        for (int i = 2; i < limit; i++) {
            if (primes[i]) {
                sum += i;
            }
        }

        System.out.println("The sum of all primes below " + limit + " is: " + sum);
    }
}
