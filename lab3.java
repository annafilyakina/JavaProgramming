
//упражнение 2
import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        System.out.print("Enter password ");
        Scanner in = new Scanner(System.in);
        String password = in.nextLine();

        if (password.matches("(.{0,7}|[^0-9]*|[^A-Z]*|[^a-z]*)")) {
            System.out.println("Weak password");
        } else {
            System.out.println("Strong password");
        }

        in.close();
    }
}
