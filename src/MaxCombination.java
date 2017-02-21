import java.util.Scanner;

/**
 * Created by Dr-Br on 23.1.2017 г..
 */
public class MaxCombination {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int start = Integer.parseInt(console.nextLine());
        int end = Integer.parseInt(console.nextLine());
        int maxCombination = Integer.parseInt(console.nextLine());
        int max = 0;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                max++;
                if (max > maxCombination){
                    break;
            }System.out.printf("<%d-%d>",i,j);
            }
        }
    }
}

