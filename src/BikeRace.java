import java.util.Scanner;

/**
 * Created by Dr-Br on 16.1.2017 г..
 */
public class BikeRace {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int juniors = Integer.parseInt(console.nextLine());
        int seniors = Integer.parseInt(console.nextLine());
        String trace = console.nextLine();

        double sumTotal = 0;

        if(trace.equals("trail")){
            sumTotal = juniors * 5.50 + seniors * 7;
        }else if(trace.equals("cross-country")){
            if (juniors + seniors < 50) {
                sumTotal = juniors * 8 + seniors * 9.50;
            }else{
                sumTotal = (juniors * 8 + seniors * 9.50) - (juniors * 8 + seniors * 9.50) * 0.25;
            }
        }else if(trace.equals("downhill")){
            sumTotal = juniors * 12.25 + seniors * 13.75;
        }else{
            sumTotal = juniors * 20 + seniors * 21.50;
        }
        sumTotal -=sumTotal * 0.05;

        System.out.printf("%.2f", sumTotal);
    }
}
