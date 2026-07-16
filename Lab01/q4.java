import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        
        //user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        System.out.println("Total: " +(num1+num2));
        System.out.println("Substraction: " +(num1-num2));
        System.out.println("Multiplication: " +(num1*num2));
        System.out.println("Division: " +(num1/num2));

        sc.close();

}
}