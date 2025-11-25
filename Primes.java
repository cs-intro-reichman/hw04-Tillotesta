public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        boolean[] prime = new boolean[n + 1];
        java.util.Arrays.fill(prime, true);

        prime[0] = false;
        prime[1] = false;

        for (int i = 0; i*i <= n; i++) {
            if (prime[i]) {
                for(int j = i*i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        
        System.out.println("Prime numbers up to " + n+":");
        int c = 0;
        for (int p = 2; p <= n; p++){
            if (prime[p]) {
                System.out.println(p);
                c++;
            }   
        }
        int percentage = (int) (100*c)/n;
        System.out.println("There are "+c+" primes between 2 and "+n+" ("+percentage+"% are primes)");
        
    }
}