
import java.util.Scanner;
public class FeeDiscountInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter fee: ");
        int fee = input.nextInt();
        System.out.print("Enter discountPercent: ");
        int discountPercent = input.nextInt();
        double discount = fee * discountPercent / 100.0;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        input.close();
    }
}
