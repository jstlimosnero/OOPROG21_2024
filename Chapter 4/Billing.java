public class Billing {
    public static void computeBill(double price) {
        double total = price + (price * 0.08);
        System.out.println("The total price for the bill is: $" + total);
    }

    public static void computeBill(double price, int quantity) {
        double total = (price * quantity) * 1.08;
        System.out.println("The total price for the bill is: $" + total);
    }

    public static void computeBill(double price, int quantity, int couponDiscount) {
        double discountedPrice = price - (price * (couponDiscount / 100.0));
        double total = (discountedPrice * quantity) + ((discountedPrice * quantity) * 1.08);
        System.out.println("The total price for the bill is: $" + total);
    }

    public static void main(String[] args) {
        computeBill(23.2);
        computeBill(15.5, 3);
        computeBill(10.00, 5, 10);
    }
}