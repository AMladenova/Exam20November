import java.util.Map;
import java.util.Scanner;

/**
 * Created by Dr-Br on 16.1.2017 г..
 */
public class FlowerShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double magnoliaPrice = 3.25;
        double hyacinthPrice = 4;
        double rosesPrice = 3.50;
        double cactiPrice = 8;

        int magnolia = Integer.parseInt(console.nextLine());
        int hyacinth = Integer.parseInt(console.nextLine());
        int roses = Integer.parseInt(console.nextLine());
        int cacti = Integer.parseInt(console.nextLine());
        double presentPrice = Double.parseDouble(console.nextLine());

        double flowersTotalPrice = magnoliaPrice * magnolia + hyacinthPrice * hyacinth + rosesPrice * roses + cactiPrice * cacti;
        flowersTotalPrice -=flowersTotalPrice * 0.05;
        double difference = flowersTotalPrice - presentPrice;


        if (difference >= 0){
            System.out.printf("She is left with %.0f leva.", Math.floor(difference));
        }else{
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(Math.abs(difference)));
        }

    }
}
