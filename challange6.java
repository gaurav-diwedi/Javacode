import java.util.Scanner;

public class challange6 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your First no: ");
        float First=input.nextFloat();
        System.out.println("Enter your second no: ");
        float Second=input.nextFloat();

        Float mul=First*Second;
        System.out.println("multiplication"+ mul);

        input.close();

    }
    
}
