import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int principal = in.nextInt();
        int time = in.nextInt();
        int rate = in.nextInt();
        int si = (principal*time*rate)/100;
        System.out.println("The simple interest for the following principal is "+si);
        in.close();
    }
}
