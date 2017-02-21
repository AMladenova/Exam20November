import java.util.Scanner;

/**
 * Created by Dr-Br on 16.1.2017 г..
 */
public class Rocket {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int leftRight = n + n / 2 - 1;
        int middle = 0;

        for (int i = 0; i < n; i++) {
            System.out.println(repeatStr(".", leftRight) + "/" + repeatStr(" ", middle) + "\\" + repeatStr(".", leftRight));
            leftRight--;
            middle += 2;
        }   leftRight++;
            middle -= 2;
            System.out.println(repeatStr(".", leftRight) + "*" + repeatStr("*", middle) + "*" + repeatStr(".", leftRight));
        for (int i = 0; i < n * 2; i++) {
            System.out.println(repeatStr(".", leftRight) + "|" + repeatStr("\\", middle) + "|" + repeatStr(".", leftRight));
        }
        for (int i = 0; i < n / 2; i++) {
            System.out.println(repeatStr(".", leftRight) + "/" + repeatStr("*", middle) + "\\" + repeatStr(".", leftRight));
            leftRight--;
            middle +=2;
        }
    }
    static String repeatStr(String strToRepeat, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(strToRepeat);
        }
        return sb.toString();
    }
}
