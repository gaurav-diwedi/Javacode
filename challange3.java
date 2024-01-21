import java.util.Scanner;

public class challange3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Swap Of Two No");
        System.out.print("Enter your First No: ");
        int a = input.nextInt();
        System.out.print("Enter your second No: ");
        int b = input.nextInt();

        int c = a;
         a = b;
         b = c;
        
        System.out.println("value of A is :" + a);
        System.out.println("value of A is :" + b);

        input.close();
    }  
    
}
