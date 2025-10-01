import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 4 numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();

        // else-if ladder to find largest
        if (a >= b && a >= c && a >= d) {
            System.out.println("Largest number is: " + a);
        } else if (b >= a && b >= c && b >= d) {
            System.out.println("Largest number is: " + b);
        } else if (c >= a && c >= b && c >= d) {
            System.out.println("Largest number is: " + c);
        } else {
            System.out.println("Largest number is: " + d);
        }

        sc.close();
    }
}
