import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        
        //user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String Name = sc.nextLine();

        System.out.println("Enter your birthyear: ");
        int birthyear = sc.nextInt();

        int age = 2026 - birthyear;

        if (age>=18)
        {
            System.out.println("You are a teenager");
        }
        else
        {
            System.out.println("Not a teenager");
        }
        

    sc.close();
    }
}
