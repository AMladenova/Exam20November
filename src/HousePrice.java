import java.util.Scanner;

/**
 * Created by Dr-Br on 16.1.2017 г..
 */
public class HousePrice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double smallestRoom = Double.parseDouble(console.nextLine());
        double kitchen = Double.parseDouble(console.nextLine());
        double sqmPrice = Double.parseDouble(console.nextLine());

        double bathroom = smallestRoom / 2;
        double secondRoom = smallestRoom + smallestRoom * 0.1;
        double thirdRoom = secondRoom + secondRoom * 0.1;
        double sqmTotal = smallestRoom + secondRoom + thirdRoom + kitchen + bathroom;
        sqmTotal +=sqmTotal * 0.05;
        double priceTotal = sqmTotal * sqmPrice;


        System.out.printf("%.2f", priceTotal);
    }
}
