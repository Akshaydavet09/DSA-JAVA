import java.util.Scanner;

public class Methods {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.print(i + "  ");
            }
        }
        System.out.print("these all are primes");
    }

    public static int binary(int dec){
        int binary = 0;
        int pow = 0;

        while(dec>0){
            binary = binary + (dec%2) * (int) Math.pow(10, pow);
            pow++;
            dec/=2;
        }
        return binary;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        // System.out.println(factorial(number));
        // primeInRange(number);


        System.out.println(binary(number));












    }
}