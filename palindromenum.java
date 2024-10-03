import java.util.Scanner;
public class palindromenum {
    public static void main(String[] args) {
        int n, s = 0, c, r;
        System.out.print("Enter any Number ");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        c = n;
        while(n > 0) {
            r = n % 10;
            s = (s * 10) +r;
            n = n / 10;
        }
        if(c == s)
        System.out.print("Palindrome Number ");
        else 
        System.out.println("Not a Palindrome Number ");
    } 
}
