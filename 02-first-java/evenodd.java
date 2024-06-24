import java.util.Scanner;
public class evenodd{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int num1 = (int)(num%2);
        if(num1 == 0){
          System.out.println(num+" is a even number");
        }else{
            System.out.println(num+" is a odd number");
        }
        in.close();
    }
}