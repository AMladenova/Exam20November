import java.util.Scanner;

/**
 * Created by Dr-Br on 16.1.2017 г..
 */
public class Logistics {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int loads = Integer.parseInt(console.nextLine());
        int sumTons = 0;

        double microbus = 0;
        double truck = 0;
        double train = 0;

        for (int i = 0; i < loads ; i++) {
            int tons = Integer.parseInt(console.nextLine());

            if (tons <= 3) {
                microbus += tons;
            } else if (tons >= 4 && tons <= 11) {
                truck += tons;
            } else if (tons >= 12) {
                train += tons;
            }
            sumTons += tons;
        }
            double microbusPrice = microbus * 200;
            double truckPrice = truck * 175;
            double trainPrice = train * 120;

            double totalPrice = microbusPrice + truckPrice + trainPrice;

            System.out.printf("%.2f\n", totalPrice / sumTons);
            System.out.printf("%.2f%%\n", microbus / sumTons * 100);
            System.out.printf("%.2f%%\n", truck / sumTons * 100);
            System.out.printf("%.2f%%\n", train / sumTons * 100);
    }
}
