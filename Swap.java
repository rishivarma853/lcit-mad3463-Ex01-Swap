import java.util.*;

public class Swap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n  Enter x :  ");
        int x = scan.nextInt();
        System.out.print("\n  Enter y :  ");
        int y = scan.nextInt();

        System.out.println("\n  Before Swapping : \t x = " + x + ", y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("\n  After Swapping : \t\t x = " + x + ", y = " + y);

    }
}
