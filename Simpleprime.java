import java.util.Scanner;
public class Simpleprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter the second number (b): ");
        int b = sc.nextInt();
        int count = 0;
        for (int i = a + 1; i < b; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && i > 1) {
                count++;
            }
        }

        System.out.println("There are " + count + " prime numbers between " + a + " and " + b);
        
        sc.close(); 
    }
}