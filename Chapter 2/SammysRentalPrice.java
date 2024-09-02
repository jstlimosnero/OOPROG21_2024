package activities;
import java.util.Scanner;

public class SammysRentalPrice {
   
    public static void main(String[] args) {
      
       Scanner scanner = new Scanner(System.in);
        int costPerHour = 40; 
        int costPerMinute = 1; 
       
       System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
       System.out.println("S Sammy's makes it fun in the sun. S");
       System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
       System.out.println(" ");        

        System.out.print("Enter the number of minutes rented: ");
        int totalMinutes = scanner.nextInt();

      
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

       
        double totalCost = (hours * costPerHour) + (minutes * costPerMinute);

    
        System.out.println("Sammy's Seashore Supplies: Your beach adventure starts here!");
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Total Price: $" + totalCost);

       
       
    }
}