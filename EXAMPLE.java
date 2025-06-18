import java.util.Scanner;
public class EXAMPLE {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();
		System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();
		System.out.println("Prime numbers between " + a + " and " + b + " are:");
        findPrimesBetween(a, b);
		scanner.close();
    }
public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
public static void findPrimesBetween(int a, int b) {
         if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }
}