import java.util.Scanner;

public class CommonDivisor {
    public static void main(String[] args) {
        int a,b;
        Scanner number = new Scanner(System.in);
        System.out.println("Nhập a :");
        a = number.nextInt();
        System.out.println("Nhập b :");
        b = number.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0)
            System.out.println("No greatest common factor");

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}
