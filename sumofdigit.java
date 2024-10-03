import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        int  n, r, sum = 0;
        System.out.print("Enter any number:");
        try (Scanner ref = new Scanner(System.in)) {
            n = ref.nextInt();
        }
        while (n > 0) {
            r = n % 10;
            sum = sum + r;
            n = n % 10;
            System.out.println("The sum of the digit " +sum);
        }
    }
}
