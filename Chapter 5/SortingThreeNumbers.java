import java.util.Scanner;

public class SortingThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 1st value: ");
        int a = scanner.nextInt();
        System.out.print("Enter the 2nd value: ");
        int b = scanner.nextInt();
        System.out.print("Enter the 3rd value: ");
        int c = scanner.nextInt();

        int ascending;
        
        if (a > b) {
            ascending = a;
            a = b;
            b = ascending;
        }
        
        if (b > c) {
            ascending = b;
            b = c;
            c = ascending;
        }
        
        if (a > b) {
            ascending = a;
            a = b;
            b = ascending;
        }

        System.out.println("Numbers in Ascending Order: " + a + " " + b + " " + c);

    }
}