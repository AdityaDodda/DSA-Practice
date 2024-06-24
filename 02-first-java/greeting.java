import java.util.Scanner;
public class greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Hello everyone my name is "+name);
        in.close();
    }
}
