import java.util.Scanner;

public class challange1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first num: ");
        int a = input.nextInt();
        System.out.print("Enter your second num: ");
        int b = input.nextInt();
        int sum =a+b;
        System.out.print("sum of the no:" + sum);


           input.close();
    }
}
