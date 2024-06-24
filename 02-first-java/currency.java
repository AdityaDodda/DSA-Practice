import java.util.Scanner;
public class currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rupees = in.nextInt();
        int usd = rupees/84;
        System.out.println("The converted currency in usd is "+usd);
        in.close();
    }
}
